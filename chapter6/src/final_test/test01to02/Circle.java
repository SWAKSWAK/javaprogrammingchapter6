package final_test.test01to02;

public class Circle {
	private int x;
	private int y;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	public boolean equals(Object obj) {
		Circle c = (Circle)obj;
		if (x==c.x && y==c.y)
			return true;
		else
			return false;
	}
	public String toString() {
		return "Circle(" + x + "," + y +")¹ÝÁö¸§" + radius;
	}
}
