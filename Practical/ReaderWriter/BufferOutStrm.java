package corejava;

//Importing required classes
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOutStrm {

	public static void main(String args[]) throws Exception {

		FileOutputStream fout = new FileOutputStream("E:\\myFile.txt");

		BufferedOutputStream bout = new BufferedOutputStream(fout);

		String s = "Welcome to Lecture.";

		byte b[] = s.getBytes();

		bout.write(b);

		bout.flush();

		bout.close();

		fout.close();

		System.out.println("success");
	}
}