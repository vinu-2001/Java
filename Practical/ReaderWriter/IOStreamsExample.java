//Java program reads data from a particular file using FileReader and writes it to another, using FileWriter.
package corejava;

import java.io.*;
public class IOStreamsExample {
   public static void main(String args[]) throws IOException {
      //Creating FileReader object
      File file = new File("E:/myFile.txt");
      // To read from the created file
      FileReader reader = new FileReader(file);
      char chars[] = new char[(int) file.length()];
      //Reading data from the file
      reader.read(chars);
      System.out.println(chars);
      reader.close();
      //Writing data to another file
      File out = new File("E:/CopyOfmyFile.txt");
      FileWriter writer = new FileWriter(out);
      //Writing data to the file
      writer.write(chars);
      writer.flush();
      writer.close();
      System.out.println("Data successfully written in the specified file");
   }
}
