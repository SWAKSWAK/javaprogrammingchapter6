package final_test.test07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		StringTokenizer st;
		
		while (true) {
			System.out.print(">>");
			String s = sc.nextLine();
			if (s.equals("�׸�")) {
				System.out.println("�����մϴ�..");
				sc.close();
				return;
			}
			st = new StringTokenizer(s);
			System.out.println("st.���� ������ " + st.countTokens());
			
			String[] sa = s.split(" ");
			System.out.println("split.���� ������ " + sa.length);
		}
	}
}
