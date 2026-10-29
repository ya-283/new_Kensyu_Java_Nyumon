package ch18;

import java.io.FileReader;

public class Main18_01 {
	public static void main(String[] aargs) throws Exception {
		FileReader fr = new FileReader("data.txt");
		int input = fr.read();
		while (input != -1) {
			System.out.println((char) input);
			input = fr.read();
		}
		fr.close();
	}
}
