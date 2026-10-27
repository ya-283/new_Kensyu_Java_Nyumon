package ch14;

//code14_4 Heroクラスの文字情報を表示する
public class Main14_04 {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		System.out.println(h.toString());
	}
}
