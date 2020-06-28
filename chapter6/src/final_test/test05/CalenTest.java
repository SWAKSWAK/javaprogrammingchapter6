package final_test.test05;

import java.util.Calendar;

public class CalenTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR);
		int hourOfDay = c.get(Calendar.HOUR_OF_DAY);
		int min = c.get(Calendar.MINUTE);
		
		
		
		System.out.println("현재 시간은" + hour + "시" + min + "분 입니다.");
		if (hourOfDay>=4 && hourOfDay<12) 
			System.out.println("Good Morning");
		else if (hourOfDay<18)
			System.out.println("Good Afternoon");
		else if (hourOfDay<22)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");

	}
}
