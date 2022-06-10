package corejava;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStrmReader {

    public static void main(String[] args) {  
        try  {  
            InputStream stream = new FileInputStream("E:\\myFile.txt");  
            Reader reader = new InputStreamReader(stream);  
            int data = reader.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = reader.read();  
            } 
            reader.close();
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  

}
