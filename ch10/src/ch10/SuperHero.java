package ch10;

// code10_2 朝香さんが作成したSuperHeroクラス
// code10_3 Heroクラスを継承してSuperHeroを作成する
// code10_5 SuperHeroクラスにrun()を再定義する
// code10_8 attack()をオーバーライドしたSuperHero
// code10_9 親クラスのattack()を呼び出す
public class SuperHero extends Hero {
	boolean flying;

	// 飛ぶ
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	// 着地する
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	//　逃げる
	public void run() {
		System.out.println(this.name + "は撤退した");
	}
	// 戦う
	public void attack(Matango m) {
		super.attack(m); //親インスタンス部分のattack()を呼び出し
		if(this.flying) {
			super.attack(m); //親インスタンス部分のattack()を呼び出し
		}
	}
}
