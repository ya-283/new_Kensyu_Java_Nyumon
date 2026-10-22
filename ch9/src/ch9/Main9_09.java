package ch9;

// code9_9 コンストラクタが定義されたHeroを生み出す
public class Main9_09 {
	public static void main(String[] args) {
		Hero h = new Hero(); //インスタンス生成と同時にコンストラクタによってHPに100が代入される

		System.out.println(h.hp); //「100」と表示される
	}
}
