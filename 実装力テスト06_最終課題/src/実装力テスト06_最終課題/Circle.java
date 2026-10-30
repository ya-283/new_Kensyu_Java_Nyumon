package 実装力テスト06_最終課題;

// 中心座標と半径を指定することで、円を描画するクラス
public class Circle extends Shape {
	private Point center;
	private int radius;

	// 引数なしコンストラクタの定義 center(x,y座標)、半径全て0で初期化する
	public Circle() {
		this.center = new Point();
		this.radius = 0;
	}

	public Circle(int x, int y, int r) {
		this.center = new Point(x, y);
		this.radius = r;
	}

	public void draw() {
		System.out.println("[円を描画]中心点" + center + "から半径" + radius);
	}

	public double getPerimeter() {
		double ans = Math.PI * radius * 2;
		return ans;
	}
}
