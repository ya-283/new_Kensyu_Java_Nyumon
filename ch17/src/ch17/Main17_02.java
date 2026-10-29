package ch17;

import java.io.*;

public class Main17_02 {
	public static void main(String[] args) {
		try {
		FireWriter fw = new FireWriter("data.txt");
	}catch(IOException e) {
		System.out.println("エラーが発生しました");
	}
}
