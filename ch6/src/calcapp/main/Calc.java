package calcapp.main;

import calcapp.logics.CalcLogic;

/*code6_3 mainメソッドだけが残されたCalc.java
 *code6_4 正しく修正したCalc.java
 *code6_5 Calcをcalcapp.mainに所属させる
 *code6_7 別のパッケージにあるクラスを呼び出す
 *code6_8 calcapp.logics.CalcLogicをインポートする
 *code6_9 calcapp.logicsの全クラスをインポートする */
public class Calc {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = CalcLogic.tasu(a, b);
		int delta = calcapp.logics.CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}

}
