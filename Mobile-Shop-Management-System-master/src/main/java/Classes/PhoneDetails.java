
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PhoneDetails {
     Methods phones=new Methods("PhoneDetails.txt");
   private String PhoneId;
   private String BrandName;
   private String Name;
   private String OS;
   private String Display;
   private String Camera;
   private String Processor;
   private String RAM;
   private String Storage;
   private String Battery;
   private String Price;
   private String Category;
   private int PhoneCount;

   public PhoneDetails()
   {}

    public PhoneDetails(String PhoneId, String BrandName) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display, String Camera) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
        this.Camera = Camera;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display, String Camera, String Processor) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
        this.Camera = Camera;
        this.Processor = Processor;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display, String Camera, String Processor, String RAM) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
        this.Camera = Camera;
        this.Processor = Processor;
        this.RAM = RAM;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display, String Camera, String Processor, String RAM, String Storage) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
        this.Camera = Camera;
        this.Processor = Processor;
        this.RAM = RAM;
        this.Storage = Storage;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display, String Camera, String Processor, String RAM, String Storage, String Battery) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
        this.Camera = Camera;
        this.Processor = Processor;
        this.RAM = RAM;
        this.Storage = Storage;
        this.Battery = Battery;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display, String Camera, String Processor, String RAM, String Storage, String Battery, String Price) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
        this.Camera = Camera;
        this.Processor = Processor;
        this.RAM = RAM;
        this.Storage = Storage;
        this.Battery = Battery;
        this.Price = Price;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display, String Camera, String Processor, String RAM, String Storage, String Battery, String Price, String Category) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
        this.Camera = Camera;
        this.Processor = Processor;
        this.RAM = RAM;
        this.Storage = Storage;
        this.Battery = Battery;
        this.Price = Price;
        this.Category = Category;
    }

    public PhoneDetails(String PhoneId, String BrandName, String Name, String OS, String Display, String Camera, String Processor, String RAM, String Storage, String Battery, String Price, String Category, int PhoneCount) {
        this.PhoneId = PhoneId;
        this.BrandName = BrandName;
        this.Name = Name;
        this.OS = OS;
        this.Display = Display;
        this.Camera = Camera;
        this.Processor = Processor;
        this.RAM = RAM;
        this.Storage = Storage;
        this.Battery = Battery;
        this.Price = Price;
        this.Category = Category;
        this.PhoneCount = PhoneCount;
    }

    public String getPhoneId() {
        return PhoneId;
    }

    public void setPhoneId(String PhoneId) {
        this.PhoneId = PhoneId;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getDisplay() {
        return Display;
    }

    public void setDisplay(String Display) {
        this.Display = Display;
    }

    public String getCamera() {
        return Camera;
    }

    public void setCamera(String Camera) {
        this.Camera = Camera;
    }

    public String getProcessor() {
        return Processor;
    }

    public void setProcessor(String Processor) {
        this.Processor = Processor;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String Storage) {
        this.Storage = Storage;
    }

    public String getBattery() {
        return Battery;
    }

    public void setBattery(String Battery) {
        this.Battery = Battery;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getPhoneCount() {
        return PhoneCount;
    }

    public void setPhoneCount(int PhoneCount) {
        this.PhoneCount = PhoneCount;
    }
    

   
  
    public boolean addNewPhone(){
      if (Database.ensureInitialized()) {
          Boolean dbResult = addNewPhoneDb();
          if (dbResult != null) {
              return dbResult;
          }
      }
       
       if(!phones.createanewfile()){
           
           String record=PhoneId+" "+BrandName+" "+Name+" "+OS+" "+Display+" "+Camera+" "+Processor+" "+RAM+" "+Storage+" "+Battery+" "+Price+" "+Category+" ";
           return phones.writedatatothefile(record);
           
       }
       return false;
   }
     public boolean SearchPhones(String PhoneId)
      {
        if (Database.ensureInitialized()) {
            Boolean dbResult = searchPhonesDb(PhoneId);
            if (dbResult != null) {
                return dbResult;
            }
        }

        boolean Found = false;
         
        try {
            String[] words = null;
            BufferedReader phone = phones.readAFile();
            if (phone == null) {
                return false;
            }
            String Sphone;
            while ((Sphone = phone.readLine()) != null) {
                words = Sphone.trim().split("\\s+");
                if (words.length < 12) {
                    continue;
                }
                if (words[0].equalsIgnoreCase(PhoneId.trim())) {
                    Found = true;
                    this.setPhoneId(words[0]);
                    this.setBrandName(words[1]);
                    this.setName(words[2]);
                    this.setOS(words[3]);
                    this.setDisplay(words[4]);
                    this.setCamera(words[5]);
                    this.setProcessor(words[6]);
                    this.setRAM(words[7]);
                    this.setStorage(words[8]);
                    this.setBattery(words[9]);
                    this.setPrice(words[10]);
                    this.setCategory(words[11]);
                    break;
                }
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
        return Found;
      }


    
     public String viewAllphones () 
        {
        if (Database.ensureInitialized()) {
            String dbResult = viewAllPhonesDb();
            if (dbResult != null) {
                return dbResult;
            }
        }

        String Phone, allphones = " ";
        String[] words = null;
        int count = 0;

        BufferedReader phoneDetails = phones.readAFile();

        try {
            while ((Phone = phoneDetails.readLine()) != null)
            {    
                words = Phone.split(" ");             
                allphones = allphones + words[0] +  "\t" +  words[1] + "\t" + words[2] + "\t" + words[3]
                        + "\t" + words[4] + "\t" + words[5] + "\t" + words[6] + "\t" + words[7] + "\t" + words[8]
                        + "\t" + words[9] + "\t" + words[10] + "\t" + words[11] + "\t" + words[12];
                           
                count++; 
            }
        } catch (Exception e) {
            System.err.println("ERROR"+e);
        }
        
        setPhoneCount(count);//2
        return allphones;
    }

    public static List<PhoneDetails> listAllPhones() {
        if (Database.ensureInitialized()) {
            List<PhoneDetails> db = listAllPhonesDb();
            if (db != null) {
                return db;
            }
        }
        return listAllPhonesFile();
    }

    public static boolean deletePhoneById(String phoneId) {
        if (Database.ensureInitialized()) {
            Boolean db = deletePhoneDb(phoneId);
            if (db != null) {
                return db;
            }
        }
        return deletePhoneFile(phoneId);
    }

    public static boolean updatePhone(PhoneDetails updated) {
        if (Database.ensureInitialized()) {
            Boolean db = updatePhoneDb(updated);
            if (db != null) {
                return db;
            }
        }
        return updatePhoneFile(updated);
    }

    private static List<PhoneDetails> listAllPhonesDb() {
        String sql = "SELECT phone_id, brand_name, name, os, display_size, camera, processor, ram, storage, battery, price, category FROM phones";
        List<PhoneDetails> list = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                PhoneDetails p = new PhoneDetails();
                p.setPhoneId(rs.getString("phone_id"));
                p.setBrandName(rs.getString("brand_name"));
                p.setName(rs.getString("name"));
                p.setOS(rs.getString("os"));
                p.setDisplay(rs.getString("display_size"));
                p.setCamera(rs.getString("camera"));
                p.setProcessor(rs.getString("processor"));
                p.setRAM(rs.getString("ram"));
                p.setStorage(rs.getString("storage"));
                p.setBattery(rs.getString("battery"));
                p.setPrice(rs.getString("price"));
                p.setCategory(rs.getString("category"));
                list.add(p);
            }
            return list;
        } catch (SQLException exception) {
            return null;
        }
    }

    private static Boolean deletePhoneDb(String phoneId) {
        String sql = "DELETE FROM phones WHERE phone_id = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, phoneId);
            int affected = statement.executeUpdate();
            return affected > 0;
        } catch (SQLException exception) {
            return null;
        }
    }

    private static Boolean updatePhoneDb(PhoneDetails updated) {
        String sql = "UPDATE phones SET brand_name=?, name=?, os=?, display_size=?, camera=?, processor=?, ram=?, storage=?, battery=?, price=?, category=? WHERE phone_id=?";
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, updated.getBrandName());
            statement.setString(2, updated.getName());
            statement.setString(3, updated.getOS());
            statement.setString(4, updated.getDisplay());
            statement.setString(5, updated.getCamera());
            statement.setString(6, updated.getProcessor());
            statement.setString(7, updated.getRAM());
            statement.setString(8, updated.getStorage());
            statement.setString(9, updated.getBattery());
            statement.setString(10, updated.getPrice());
            statement.setString(11, updated.getCategory());
            statement.setString(12, updated.getPhoneId());
            int affected = statement.executeUpdate();
            return affected > 0;
        } catch (SQLException exception) {
            return null;
        }
    }

    private static List<PhoneDetails> listAllPhonesFile() {
        List<PhoneDetails> list = new ArrayList<>();
        File file = resolvePhoneDetailsFile();
        if (file == null || !file.exists()) {
            return list;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }
                String[] w = line.split("\\s+");
                if (w.length < 12) {
                    continue;
                }
                PhoneDetails p = new PhoneDetails();
                p.setPhoneId(w[0]);
                p.setBrandName(w[1]);
                p.setName(w[2]);
                p.setOS(w[3]);
                p.setDisplay(w[4]);
                p.setCamera(w[5]);
                p.setProcessor(w[6]);
                p.setRAM(w[7]);
                p.setStorage(w[8]);
                p.setBattery(w[9]);
                p.setPrice(w[10]);
                p.setCategory(w[11]);
                list.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error reading phones: " + e.getMessage());
        }
        return list;
    }

    private static boolean deletePhoneFile(String phoneId) {
        File file = resolvePhoneDetailsFile();
        if (file == null || !file.exists()) {
            return false;
        }
        List<String> kept = new ArrayList<>();
        boolean deleted = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String trimmed = line.trim();
                if (trimmed.isEmpty()) {
                    continue;
                }
                String[] w = trimmed.split("\\s+");
                if (w.length > 0 && w[0].equalsIgnoreCase(phoneId.trim())) {
                    deleted = true;
                    continue;
                }
                kept.add(trimmed);
            }
        } catch (Exception e) {
            return false;
        }

        if (!deleted) {
            return false;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
            for (String l : kept) {
                writer.write(l);
                writer.newLine();
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private static boolean updatePhoneFile(PhoneDetails updated) {
        File file = resolvePhoneDetailsFile();
        if (file == null || !file.exists()) {
            return false;
        }
        List<String> out = new ArrayList<>();
        boolean updatedAny = false;
        String targetId = updated.getPhoneId() == null ? "" : updated.getPhoneId().trim();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String trimmed = line.trim();
                if (trimmed.isEmpty()) {
                    continue;
                }
                String[] w = trimmed.split("\\s+");
                if (w.length > 0 && w[0].equalsIgnoreCase(targetId)) {
                    out.add(serializeFileRecord(updated));
                    updatedAny = true;
                } else {
                    out.add(trimmed);
                }
            }
        } catch (Exception e) {
            return false;
        }
        if (!updatedAny) {
            return false;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
            for (String l : out) {
                writer.write(l);
                writer.newLine();
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private static String serializeFileRecord(PhoneDetails p) {
        return safe(p.getPhoneId()) + " " + safe(p.getBrandName()) + " " + safe(p.getName()) + " " + safe(p.getOS()) + " "
                + safe(p.getDisplay()) + " " + safe(p.getCamera()) + " " + safe(p.getProcessor()) + " " + safe(p.getRAM()) + " "
                + safe(p.getStorage()) + " " + safe(p.getBattery()) + " " + safe(p.getPrice()) + " " + safe(p.getCategory());
    }

    private static String safe(String v) {
        if (v == null) return "";
        return v.trim().replaceAll("\\s+", "_");
    }

    private static File resolvePhoneDetailsFile() {
        // Prefer legacy path if it exists (older screens still write there).
        File legacy = new File("D:\\Java\\PhoneDetails.txt");
        if (legacy.exists()) {
            return legacy;
        }
        // Otherwise use the current Methods location.
        try {
            Methods m = new Methods("PhoneDetails.txt");
            m.createanewfile();
            return new File(System.getProperty("user.home") + File.separator + "MobileShopData" + File.separator + "PhoneDetails.txt");
        } catch (Exception e) {
            return legacy;
        }
    }

    private Boolean addNewPhoneDb() {
        String sql = "INSERT INTO phones (phone_id, brand_name, name, os, display_size, camera, processor, ram, storage, battery, price, category) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, PhoneId);
            statement.setString(2, BrandName);
            statement.setString(3, Name);
            statement.setString(4, OS);
            statement.setString(5, Display);
            statement.setString(6, Camera);
            statement.setString(7, Processor);
            statement.setString(8, RAM);
            statement.setString(9, Storage);
            statement.setString(10, Battery);
            statement.setString(11, Price);
            statement.setString(12, Category);
            statement.executeUpdate();
            return true;
        } catch (SQLException exception) {
            if ("23000".equals(exception.getSQLState())) {
                return false;
            }
            return null;
        }
    }

    private Boolean searchPhonesDb(String phoneId) {
        String sql = "SELECT phone_id, brand_name, name, os, display_size, camera, processor, ram, storage, battery, price, category FROM phones WHERE phone_id = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, phoneId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    this.setPhoneId(resultSet.getString("phone_id"));
                    this.setBrandName(resultSet.getString("brand_name"));
                    this.setName(resultSet.getString("name"));
                    this.setOS(resultSet.getString("os"));
                    this.setDisplay(resultSet.getString("display_size"));
                    this.setCamera(resultSet.getString("camera"));
                    this.setProcessor(resultSet.getString("processor"));
                    this.setRAM(resultSet.getString("ram"));
                    this.setStorage(resultSet.getString("storage"));
                    this.setBattery(resultSet.getString("battery"));
                    this.setPrice(resultSet.getString("price"));
                    this.setCategory(resultSet.getString("category"));
                    return true;
                }
                return false;
            }
        } catch (SQLException exception) {
            return null;
        }
    }

    private String viewAllPhonesDb() {
        String allphones = " ";
        int count = 0;
        String sql = "SELECT phone_id, brand_name, name, os, display_size, camera, processor, ram, storage, battery, price, category FROM phones";
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                allphones = allphones
                        + resultSet.getString("phone_id") + "\t"
                        + resultSet.getString("brand_name") + "\t"
                        + resultSet.getString("name") + "\t"
                        + resultSet.getString("os") + "\t"
                        + resultSet.getString("display_size") + "\t"
                        + resultSet.getString("camera") + "\t"
                        + resultSet.getString("processor") + "\t"
                        + resultSet.getString("ram") + "\t"
                        + resultSet.getString("storage") + "\t"
                        + resultSet.getString("battery") + "\t"
                        + resultSet.getString("price") + "\t"
                        + resultSet.getString("category");
                count++;
            }
            setPhoneCount(count);
            return allphones;
        } catch (SQLException exception) {
            return null;
        }
    }
        
    
  
   
}
