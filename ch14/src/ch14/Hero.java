package ch14;
// code14_5 意図する文字列表現を返すtoString()を定義
// code14_7 名前が同じなら同じ勇者とするequals()を定義
// code14_8 各インスタンスのフィールドは独立している
// code14_9 staticによるフィールドの共有
// code14_13 所持金をランダムに設定する
public class Hero {
	String name;
	int hp;
	static int money;

	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000) ;
	}
}
