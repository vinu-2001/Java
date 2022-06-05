package corejava;

//Importing required classes
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutStrm {

	public static void main(String args[])throws Exception{    
	      FileOutputStream fout1=new FileOutputStream("E:\\myFile.txt");    
	      FileOutputStream fout2=new FileOutputStream("E:\\myFileA.txt");    
	        
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      bout.write(66);    
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2);    
	        
	      bout.flush();    
	      bout.close();//has no effect    
	      System.out.println("Success...");    
	     }    
	    }  


