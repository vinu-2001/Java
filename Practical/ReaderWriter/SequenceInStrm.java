package corejava;

//Importing required classes
import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceInStrm {

	public static void main(String args[]) throws Exception {
		FileInputStream input1 = new FileInputStream("E:\\myFile.txt");
		FileInputStream input2 = new FileInputStream("E:\\myFileA.txt");
		SequenceInputStream inst = new SequenceInputStream(input1, input2);
		int j;
		while ((j = inst.read()) != -1) {
			System.out.print((char) j);
		}
		inst.close();
		input1.close();
		input2.close();
	}
}
