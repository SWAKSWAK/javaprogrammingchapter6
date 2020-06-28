package final_test.test03.main;

import final_test.test03.etc.Calc;





public class MainApp {
	public static void main (String[] args) {
		Calc c = new Calc(10, 20);
		System.out.println(c.sum());
	}
}
