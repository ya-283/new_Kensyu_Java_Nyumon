package ch15;

// code15_3 文字列切り出しメソッドを利用する
public class Main15_03 {
	public static void main(String[] args) {
		String s1 = "Java programming";
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3)); //→a programming
		System.out.println("文字列s1の4～8文字目は" + s1.substring(3, 8)); //→a pro
	}
}
