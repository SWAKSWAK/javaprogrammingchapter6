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
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		System.out.print("솩솩이 시작 <Enter>키 : ");
		sc.nextLine();
		cal = Calendar.getInstance();
		eeBefore = cal.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + eeBefore);
		System.out.print("10초 예상 후 <Enter>키 : ");
		sc.nextLine();
		cal = Calendar.getInstance();
		eeTen = cal.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + eeTen);
		System.out.print("솩솩삼 시작 <Enter>키 : ");
		sc.nextLine();
		cal = Calendar.getInstance();
		samBefore = cal.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + samBefore);
		System.out.print("10초 예상 후 <Enter>키 : ");
		sc.nextLine();
		cal = Calendar.getInstance();
		samTen = cal.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + samTen);
		
		eeResult = eeTen - eeBefore;
		samResult = samTen - samBefore;
		System.out.print("솩솩이의 결과" + eeResult + ", " + "솩솩삼의 결과 " + samResult);
		if (eeResult > samResult)
			System.out.println(", 승자는 솩솩이");
		else if (eeResult < samResult)
			System.out.println(", 승자는 솩솩삼");
		else
			System.out.println(", 무승부");
		sc.close();
	}
}
