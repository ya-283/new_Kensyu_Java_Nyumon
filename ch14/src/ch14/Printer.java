package ch14;

// code14_3 どんなインスタンスでも受け取れるメソッド
public class Printer {
	public void printAnything(Object o) {
		//どんな型のインスタンスでも受け取って画面に表示
		System.out.println(o.toString());
	}
}
