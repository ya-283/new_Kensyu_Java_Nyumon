package ch17;

import java.io.FileWriter;
import java.io.IOException;

public class Main17_04 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		} catch (IOException e) {
			System.out.println("エラーです");
		}
		fw.close();
	}
}
