package final_test.test12;

import java.util.Scanner;

import final_test.test10.Person;

public class NewGambleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Person p[] = null;
		boolean win;
		int count = 0;
		
		System.out.print("���� ���ӿ� ������ ���� ����>>");
		p = new Person[sc.nextInt()];
		for (int i = 0 ; i < p.length ; i++) {
			System.out.print((i+1) + "��° ���� �̸�>>");
			p[i] = new Person(sc.next());
		}
		
		while (true) {
			System.out.println("[" + p[count].getGamblerName() + "]:<Enter>");
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
