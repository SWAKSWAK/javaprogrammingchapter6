package final_test.test01to02;

public class MyPoint {
	private int a;
	private int b;
	
	public MyPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "Point(" + a + "," + b + ")";
	}
}
