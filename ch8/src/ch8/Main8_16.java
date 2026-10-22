package ch8;

// code8_16 仮想世界に勇者とお化けキノコ２匹を生み出す
public class Main8_16 {
	public static void main(String[] args) {
		Hero h = new Hero(); //勇者を生成し初期化
		h.name = "ミナト";
		h.hp = 100;

		Matango m1 = new Matango(); //お化けキノコA（１匹目）を生成し初期化
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango(); //お化けキノコB（２匹目）を生成し初期化
		m2.hp = 48;
		m2.suffix = 'B';

		//冒険の始まり
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}
}
