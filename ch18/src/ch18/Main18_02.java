package ch18;

import java.io.FileWriter;

public class Main18_02 {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("data.txt");
		fw.write('さ');
		fw.write('よ');
		fw.write('う');
		fw.write('な');
		fw.write('ら');
		fw.close();
	}
}
