
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static final String DB_URL = System.getenv().getOrDefault(
            "MOBILE_SHOP_DB_URL",
            "jdbc:mysql://localhost:3306/mobile_shop?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC"
    );
    private static final String DB_USER = System.getenv().getOrDefault("MOBILE_SHOP_DB_USER", "root");
    private static final String DB_PASSWORD = System.getenv().getOrDefault("MOBILE_SHOP_DB_PASSWORD", "");
    private static boolean initialized = false;

    private Database() {
    }

    public static boolean isEnabled() {
        return !"false".equalsIgnoreCase(System.getenv("MOBILE_SHOP_DB_ENABLED"));
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public static synchronized boolean ensureInitialized() {
        if (!isEnabled()) {
            return false;
        }

        if (initialized) {
            return true;
        }

        try (Connection connection = getConnection(); Statement statement = connection.createStatement()) {
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS users (" +
                    "user_id VARCHAR(50) PRIMARY KEY," +
                    "name VARCHAR(100) NOT NULL," +
                    "password VARCHAR(100) NOT NULL," +
                    "user_type VARCHAR(50) NOT NULL" +
                    ")");

            statement.executeUpdate("CREATE TABLE IF NOT EXISTS managers (" +
                    "user_id VARCHAR(50) PRIMARY KEY," +
                    "name VARCHAR(100) NOT NULL," +
                    "password VARCHAR(100) NOT NULL," +
                    "user_type VARCHAR(50) NOT NULL" +
                    ")");

            statement.executeUpdate("CREATE TABLE IF NOT EXISTS phones (" +
                    "phone_id VARCHAR(50) PRIMARY KEY," +
                    "brand_name VARCHAR(100) NOT NULL," +
                    "name VARCHAR(100) NOT NULL," +
                    "os VARCHAR(100) NOT NULL," +
                    "display_size VARCHAR(100) NOT NULL," +
                    "camera VARCHAR(100) NOT NULL," +
                    "processor VARCHAR(100) NOT NULL," +
                    "ram VARCHAR(100) NOT NULL," +
                    "storage VARCHAR(100) NOT NULL," +
                    "battery VARCHAR(100) NOT NULL," +
                    "price VARCHAR(100) NOT NULL," +
                    "category VARCHAR(100) NOT NULL" +
                    ")");

            initialized = true;
            return true;
        } catch (SQLException exception) {
            System.out.println("MySQL unavailable, falling back to files: " + exception.getMessage());
            return false;
        }
    }
}
