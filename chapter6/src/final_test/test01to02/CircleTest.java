package final_test.test01to02;

public class CircleTest {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		if (p.equals(q))
			System.out.println("������");
		else
			System.out.println("�ٸ���");
		
		
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		
		if (a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("�ٸ� ��");
	}

}
