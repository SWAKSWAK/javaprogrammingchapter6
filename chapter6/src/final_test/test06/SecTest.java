package final_test.test06;

import java.util.Calendar;
import java.util.Scanner;

public class SecTest {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner (System.in);
		int eeBefore;
		int samBefore;
		int eeTen;
		int samTen;
		int eeResult;
		int samResult;
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		System.out.print("�޼��� ���� <Enter>Ű : ");
		sc.nextLine();
		cal = Calendar.getInstance();
		eeBefore = cal.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = " + eeBefore);
		System.out.print("10�� ���� �� <Enter>Ű : ");
		sc.nextLine();
		cal = Calendar.getInstance();
		eeTen = cal.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = " + eeTen);
		System.out.print("�޼޻� ���� <Enter>Ű : ");
		sc.nextLine();
		cal = Calendar.getInstance();
		samBefore = cal.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = " + samBefore);
		System.out.print("10�� ���� �� <Enter>Ű : ");
		sc.nextLine();
		cal = Calendar.getInstance();
		samTen = cal.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = " + samTen);
		
		eeResult = eeTen - eeBefore;
		samResult = samTen - samBefore;
		System.out.print("�޼����� ���" + eeResult + ", " + "�޼޻��� ��� " + samResult);
		if (eeResult > samResult)
			System.out.println(", ���ڴ� �޼���");
		else if (eeResult < samResult)
			System.out.println(", ���ڴ� �޼޻�");
		else
			System.out.println(", ���º�");
		sc.close();
	}
}
