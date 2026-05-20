/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Manager {
     Methods man=new Methods("Managers.txt");
   private String UserID;
   private String Name;
   private String Password;
   private String UserType;
   private int UserCount;

    public Manager(String UserID, String Name) {
        this.UserID = UserID;
        this.Name = Name;
    }

    public Manager(String UserID, String Name, String Password) {
        this.UserID = UserID;
        this.Name = Name;
        this.Password = Password;
    }

    public Manager(String UserID, String Name, String Password, String UserType) {
        this.UserID = UserID;
        this.Name = Name;
        this.Password = Password;
        this.UserType = UserType;
    }

    public Manager(String UserID, String Name, String Password, String UserType, int UserCount) {
        this.UserID = UserID;
        this.Name = Name;
        this.Password = Password;
        this.UserType = UserType;
        this.UserCount = UserCount;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public int getUserCount() {
        return UserCount;
    }

    public void setUserCount(int UserCount) {
        this.UserCount = UserCount;
    }
   
    public boolean addNewManager(){
      if (Database.ensureInitialized()) {
          Boolean dbResult = addNewManagerDb();
          if (dbResult != null) {
              return dbResult;
          }
      }
       
       if(!man.createanewfile()){
           String record=UserID+ " " +Name+ " " +Password+ " " +UserType;
           return man.writedatatothefile(record);
           
       }
       return false;
   }
     public boolean validateLogin() {
        if (Database.ensureInitialized()) {
            Boolean dbResult = validateLoginDb();
            if (Boolean.TRUE.equals(dbResult)) {
                return dbResult;
            }
        }

        try {
            String[] words = null;
            
            BufferedReader users = man.readAFile();
            if (users == null) {
                return false;
            }
            String user;

            while ((user = users.readLine()) != null) //M001 Name 123 manager 
            {              
                words = user.split(" "); // [0]=U001 [1]=Name [2]=Password [3]=manager

                if (words.length < 4) {
                    continue;
                }

                if (same(words[0], UserID) && same(words[1], Name) && same(words[2], Password) && same(words[3], UserType)) {
                    this.setUserID(words[0]);//M001
                    this.setName(words[1]);
                    this.setPassword(words[2]);//123
                    this.setUserType(words[3]);//Manager
                    return true;
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Error"+e);
        }
        
        return false;
    }

    private Boolean addNewManagerDb() {
        String sql = "INSERT INTO managers (user_id, name, password, user_type) VALUES (?, ?, ?, ?)";
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, UserID);
            statement.setString(2, Name);
            statement.setString(3, Password);
            statement.setString(4, UserType);
            statement.executeUpdate();
            return true;
        } catch (SQLException exception) {
            if ("23000".equals(exception.getSQLState())) {
                return false;
            }
            return null;
        }
    }

    private Boolean validateLoginDb() {
        String sql = "SELECT user_id, name, password, user_type FROM managers WHERE user_id = ? AND name = ? AND password = ?";
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, UserID);
            statement.setString(2, Name);
            statement.setString(3, Password);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    if (!same(resultSet.getString("user_type"), UserType)) {
                        return false;
                    }
                    this.setUserID(resultSet.getString("user_id"));
                    this.setName(resultSet.getString("name"));
                    this.setPassword(resultSet.getString("password"));
                    this.setUserType(resultSet.getString("user_type"));
                    return true;
                }
                return false;
            }
        } catch (SQLException exception) {
            return null;
        }
    }

    private boolean same(String left, String right) {
        if (left == null || right == null) {
            return false;
        }
        return left.trim().equalsIgnoreCase(right.trim());
    }
   
}
