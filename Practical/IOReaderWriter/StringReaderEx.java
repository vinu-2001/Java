package corejava;

import java.io.StringReader;

public class StringReaderEx {

    public static void main(String[] args) throws Exception {  
        String srg = "Hello Java!! \nWelcome to Mumbai.";  
        StringReader reader = new StringReader(srg);  
        int k=0;  
            while((k=reader.read())!=-1){  
                System.out.print((char)k);  
            }  
        }  
}  
