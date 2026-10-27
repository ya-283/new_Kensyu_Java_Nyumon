package ch15;

// code15_2 文字列検索メソッドを利用する
public class Main15_02 {
	public static void main(String[] args) {
		String s1 = "Java and JavaScript";
		if (s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		if (s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		}
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));

	}
}
