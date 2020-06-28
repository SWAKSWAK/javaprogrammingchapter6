package final_test.test09;

import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("ºﬁºﬁ[∞°¿ß(1), πŸ¿ß(2), ∫∏(3), ≥°≥ª±‚(4)]>>");
			int swak = sc.nextInt();
			int com = (int)(Math.random()*3) + 1;
			if (swak==4) {
				System.out.println("¡æ∑·«’¥œ¥Ÿ.");
				sc.close();
				return;
				
			}
			System.out.println("ºﬁºﬁ" + rps(swak) + " : " + "ƒƒ«ª≈Õ" + rps(com));
			System.out.println(whoWin(swak, com));
		}
	}
	private static String rps (int val) {
		switch (val) {
			case 1 :
				return "(∞°¿ß)";
			case 2 : 
				return "(πŸ¿ß)";
			case 3 :
				return "(∫∏)";
			default :
				return null;
		}
	}
	private static String whoWin (int swak, int com) {
		if (swak==1 && com==3) 
			return "ºﬁºﬁ¿Ã ¿Ã∞ÂΩ¿¥œ¥Ÿ.";
		else if (swak==2 && com==1) 
			return "ºﬁºﬁ¿Ã ¿Ã∞ÂΩ¿¥œ¥Ÿ.";
		else if (swak==3 && com==2) 
			return "ºﬁºﬁ¿Ã ¿Ã∞ÂΩ¿¥œ¥Ÿ.";
		else if (swak==com)
			return "∫Ò∞ÂΩ¿¥œ¥Ÿ.";
		else
			return "ƒƒ«ª≈Õ∞° ¿Ã∞ÂΩ¿¥œ¥Ÿ.";
	}
}
