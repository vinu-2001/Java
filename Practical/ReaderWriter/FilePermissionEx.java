package corejava;

//Importing required classes
import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

public class FilePermissionEx {

    public static void main(String[] args) throws IOException {  
        String srg = "D:\\IO Package\\java.txt";  
        FilePermission file1 = new FilePermission("D:\\IO Package\\-", "read");  
        PermissionCollection permission = file1.newPermissionCollection();  
        permission.add(file1);  
             FilePermission file2 = new FilePermission(srg, "write");  
             permission.add(file2);  
             if(permission.implies(new FilePermission(srg, "read,write"))) {  
             System.out.println("Read, Write permission is granted for the path "+srg );  
             }else {  
            System.out.println("No Read, Write permission is granted for the path "+srg);        
            }  
       }   
} 

