package ch14;

public class Main14_12 {
	// code14_12 newしなくても静的フィールドは利用できる
	public static void main(String[] args) {
		// 1人も勇者を生み出していない状況で…
		Hero.money = 100;
		System.out.println(Hero.money);
	}
}
