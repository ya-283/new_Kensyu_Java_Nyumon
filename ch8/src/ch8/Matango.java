package ch8;
//code8_5 フィールド宣言すると同時に初期値も設定
//code8_6 フィールドを定数として宣言
//code8_15 お化けキノコクラスの定義
public class Matango {
	int hp;
	final int LEVEL = 10;
	char suffix;
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！"); //⑮
	}
}
