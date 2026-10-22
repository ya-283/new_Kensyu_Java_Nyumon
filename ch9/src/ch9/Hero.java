package ch9;

// code9_3 次にHeroクラスを定義する
// code9_8 生まれた直後の動作を定義したHeroクラス
// code9_10 コンストラクタで引数を追加情報として受け取る
// code9_12 コンストラクタのオーバーロード
// code9_16 別のコンストラクタを呼び出す
public class Hero {
	String name;
	int hp;
	Sword sword; //勇者が装備している剣の情報

	public void attack() {
		System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
		System.out.println("敵に５ポイントのダメージをあたえた！");
	}
	public Hero(String name) { //引数として文字列を１つ受け取る　//コンストラクタ１
		this.hp = 100; //hpフィールドを100で初期化⑧
		this.name = name; //引数の値でnameフィールドを初期化⑩
	}
	public Hero() {
		this("ダミー"); //コンストラクタ１を呼び出すようにJVMに依頼する
	}
}
