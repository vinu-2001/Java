package corejava;

//Importing required classes
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutStrm {

    public static void main(String[] args) throws IOException {  
    	FileOutputStream file = new FileOutputStream("E:\\myFile.txt");
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}  
