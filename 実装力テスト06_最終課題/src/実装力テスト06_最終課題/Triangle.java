package 実装力テスト06_最終課題;

// 3つの座標データを指定することで、三角形を描画するクラス
public class Triangle extends Polygon {
	private Point p1;
	private Point p2;
	private Point p3;

	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);
		this.angle = 3;
	}

	public void draw() {
		System.out.println("[三角形を描画]点1" + p1 + "から点2" + p2 + "、点3" + p3 + "の三角形");
	}

	public double getPerimeter() {
		double x12 = p2.getX() - p1.getX();
		double y12 = p2.getY() - p1.getY();
		double length12 = Math.sqrt(Math.pow(x12, 2) + Math.pow(y12, 2));
		double x23 = p3.getX() - p2.getX();
		double y23 = p3.getY() - p2.getY();
		double length23 = Math.sqrt(Math.pow(x23, 2) + Math.pow(y23, 2));
		double x31 = p1.getX() - p3.getX();
		double y31 = p1.getY() - p3.getY();
		double length31 = Math.sqrt(Math.pow(x31, 2) + Math.pow(y31, 2));
		double ans = length12 + length23 + length31;
		return ans;
	}
}
