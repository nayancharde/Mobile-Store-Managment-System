
package Classes;
import java.io.*;
import javax.swing.JOptionPane;


public class Methods {
    
    private static String Filepath=System.getProperty("user.home") + File.separator + "MobileShopData" + File.separator;
    
    File file;
    private String filename;

    public Methods(String filename) {
        this.filename = filename;
        
         createanewfile();
    }
   
    public boolean createanewfile(){
        try{
            File dir = new File(Filepath);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            
            file =new File(Filepath+filename);
            
            if(file.createNewFile()){
                System.out.println("File created :" +file.getName());
                return true;
            }
            System.out.println("File already exisit !");
            return false;
        }
        catch(IOException e){
            
            System.out.println("Somethig went wrong with creating file" +e);
            return false;
            
        }
    }
    
    
    public boolean writedatatothefile(String Record){
        try {
            file.createNewFile();
            FileWriter newWriter=new FileWriter(file,true);
            BufferedWriter newBuffer=new BufferedWriter(newWriter);
            
            newBuffer.write(Record);
            newBuffer.newLine();
            newBuffer.close();
            newWriter.close();
            return true;
            
        } catch (Exception e) {
             System.out.println("Somethig went wrong with writing" +e);
            return false;
        }
    }
     
   public BufferedReader readAFile() {
        if(!createanewfile())
        {
            try {
                FileReader reader = new FileReader(file);
                BufferedReader buffer = new BufferedReader(reader);
                return buffer;
            } catch (IOException e) {
          System.out.println("Something went wrong with Reading the file" + e);
            }
        }       
        return null;
    }
}


