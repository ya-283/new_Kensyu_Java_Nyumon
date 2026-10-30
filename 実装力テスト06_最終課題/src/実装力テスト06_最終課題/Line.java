package 実装力テスト06_最終課題;

public class Line implements Figure {
	private Point p1;
	private Point p2;

	//p1(x,y座標)、p2(x,y座標)全て0で初期化する。
	public Line() {
		this.p1 = new Point();
		this.p2 = new Point();
	}

	// 引数で受け取ったデータを用いて、2つのPointオブジェクトを生成。
	// p1フィールドとp2フィールドにそれぞれを代入する。
	public Line(int x1, int y1, int x2, int y2) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
	}

	// 始点をp1、終点をp2とする。
	public void draw() {
		System.out.println("[線を描画]始点" + p1 + "から" + "終点" + p2 + "まで");
	}

	/* 始点データと終点データを使い、以下の計算式で算出した結果を返す。
		(( 終点のx座標 - 始点のx座標 ) ^2+ ( 終点のy座標 - 始点のy座標 ) ^2 ) の平方根*/
	public double getPerimeter() {
		double xlength = p2.getX() - p1.getX();
		double ylength = p2.getY() - p1.getY();
		double ans = Math.sqrt(Math.pow(xlength,2) + Math.pow(ylength,2));
		return ans;
		
	}

}
