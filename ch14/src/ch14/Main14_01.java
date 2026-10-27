package ch14;
// code14_1 何も定義していないクラスでtoString()を呼ぶ
public class Main14_01 {
	public static void main(String[] args) {
		Empty e = new Empty();
		String s = e.toString();
		System.out.println(s);
	}
}
