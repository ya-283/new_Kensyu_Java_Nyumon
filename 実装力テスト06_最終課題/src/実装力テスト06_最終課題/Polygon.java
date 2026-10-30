package 実装力テスト06_最終課題;

public abstract class Polygon extends Shape {
	protected int angle = 0;

	public abstract void draw();

	public abstract double getPerimeter();

	public int getInternalAngle() {
		int ans = (angle - 2) * 180;
		return ans;
	}
}
