package ch14;
// code14_14 newしなくても静的メソッドは呼び出せる
public class Main14_14 {
	public static void main(String[] args) {
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		Hero h1 = new Hero();
		System.out.println(h1.money);
	}
}
