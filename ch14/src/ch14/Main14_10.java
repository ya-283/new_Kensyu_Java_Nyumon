package ch14;
// code14_10 静的フィールドmoneyへのアクセス
public class Main14_10 {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		System.out.println(h1.hp);
		System.out.println(Hero.money);
	}
}
