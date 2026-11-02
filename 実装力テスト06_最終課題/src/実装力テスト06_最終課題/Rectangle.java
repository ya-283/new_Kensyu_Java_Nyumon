package 実装力テスト06_最終課題;

public class Rectangle extends Polygon {
	protected Point p;
	protected int width;
	protected int height;

	public Rectangle(int x,int y,int width,int height){
		this.p = new Point(x,y);
		this.width = width;
		this.height = height;
		this.angle = 4;
	}	
	public void  draw(){
		System.out.println("[長方形(矩形)を描画]点" + p + "を基準として幅" + width + "、高さ" + height + "の長方形");
	}
	
	public double getPerimeter() {
		double ans = (width + height) * 2;
		return ans;	
	}
}