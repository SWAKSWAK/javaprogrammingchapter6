package final_test.test09;

import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("�޼�[����(1), ����(2), ��(3), ������(4)]>>");
			int swak = sc.nextInt();
			int com = (int)(Math.random()*3) + 1;
			if (swak==4) {
				System.out.println("�����մϴ�.");
				sc.close();
				return;
				
			}
			System.out.println("�޼�" + rps(swak) + " : " + "��ǻ��" + rps(com));
			System.out.println(whoWin(swak, com));
		}
	}
	private static String rps (int val) {
		switch (val) {
			case 1 :
				return "(����)";
			case 2 : 
				return "(����)";
			case 3 :
				return "(��)";
			default :
				return null;
		}
	}
	private static String whoWin (int swak, int com) {
		if (swak==1 && com==3) 
			return "�޼��� �̰���ϴ�.";
		else if (swak==2 && com==1) 
			return "�޼��� �̰���ϴ�.";
		else if (swak==3 && com==2) 
			return "�޼��� �̰���ϴ�.";
		else if (swak==com)
			return "�����ϴ�.";
		else
			return "��ǻ�Ͱ� �̰���ϴ�.";
	}
}
