package ch8;

// code8_1 mainメソッドを作る
// code8_10 「神様のクラス」を作る
// code8_11 勇者インスタンスを生成
// code8_12 勇者インスタンスを生成して初期値を代入
public class Main {
	public static void main(String[] args) {//① //⑩
		// 1.勇者を生成
		Hero h = new Hero(); //⑪
		// 2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");//⑫
		// 3.勇者のメソッドを呼び出してゆく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}
}
