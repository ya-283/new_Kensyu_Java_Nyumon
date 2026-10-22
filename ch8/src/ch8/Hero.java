package ch8;

//code8_3 中身のない空のHeroクラスを作成
//code8_4 Heroクラスに名前とHPを変数として宣言
//code8_7 「眠る」操作に含まれる要素を記述
//code8_8 メソッド「座る」「転ぶ」「逃げる」を追加
public class Hero { //③
	String name; // 名前の宣言
	int hp; // HPの宣言　 //④

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！"); //⑦
	}

	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");
	}

	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}

	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");//⑧
	}
}
