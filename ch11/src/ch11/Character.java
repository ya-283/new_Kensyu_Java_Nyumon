package ch11;
// code11_1 Characterクラスを作成（未完成）
// code11_2 attackメソッドの中身を空にしておく
// code11_7 attack()を抽象メソッドとして宣言する
// code11_8 Characterを抽象クラスとして宣言する
public abstract class Character {
	String name;
	int hp;
	
	// 逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	// 戦う
	public  abstract void attack(Matango m) ;
}
