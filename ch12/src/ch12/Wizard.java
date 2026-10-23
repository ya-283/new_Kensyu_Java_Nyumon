package ch12;

// code12_2 Characterを継承して定義されたWizardクラス
public class Wizard extends Character {
	int mp;

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に３ポイントのダメージ");
		m.hp -= 3;
	}

	public void fireball(Matango m) {
		System.out.println(this.name + "は火の玉を放った！");
		System.out.println("敵に２０ポイントのダメージ");
		m.hp -= 5;
	}
}
