package ch10;

// code10_1 「戦う」と「逃げる」しかできないHeroクラス
// code10_7 slip()はオーバーライドできないHeroクラス
public class Hero {
	String name = "ミナト";
	int hp = 100;

	// 戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}

	// 転ぶ
	public final void slip() { //finalが付いているslipメソッドは子クラスでオーバーライド禁止
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");
	}

	//逃げる
	public void run() { //runメソッドは子クラスでオーバーライド可能
		System.out.println(this.name + "は逃げ出した！");
	}
}
