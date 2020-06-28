package final_test.test10;

import java.util.Scanner;

public class GambleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Person p[] = new Person[2];
		boolean win;
		int count = 0;
		
		
		for (int i = 0 ; i < p.length ; i++) {
			System.out.print((i+1) + "번째 선수 이름>>");
			p[i] = new Person(sc.nextLine());
		}
		
		while (true) {
			System.out.print("[" + p[count].getGamblerName() + "]:<Enter>");
			sc.nextLine();
			p[count].getScore();
			win = p[count].jackpot();
			if (win==true) {
				sc.close();
				return;
			}
			count++;
			if (count==p.length)
				count=0;
		}
		
	}
}
