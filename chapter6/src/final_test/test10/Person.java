package final_test.test10;

import java.util.Arrays;

public class Person {
	private String gamblerName;
	private int[] currentScore = new int[3];
	
	public Person(String gamblerName) {
		this.gamblerName = gamblerName;
	}
	
	public String getGamblerName() {
		return gamblerName;
	}
	public int[] getScore() {
		for(int i = 0 ; i < currentScore.length ; i++) {
			currentScore[i] = (int)(Math.random()*3) + 1;
		}
		return currentScore;
	}
	public boolean jackpot() {
		int sameIndex=0;
		for (int i = 0 ; i < currentScore.length-1 ; i++) {
			if (currentScore[i] == currentScore[i+1]) {
				sameIndex++;
			}else {
				System.out.println("\t" + Arrays.toString(currentScore)+ "아쉽군요!");
				return false;
			}
		}
		
		if (sameIndex == currentScore.length-1){
			System.out.println("\t" + Arrays.toString(currentScore)+ gamblerName + "님이 이겼습니다!");
			return true;
		}
		return false;	
	}
}
