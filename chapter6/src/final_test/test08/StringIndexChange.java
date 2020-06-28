package final_test.test08;

public class StringIndexChange {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("I Love you");
		
		for (int i = 0 ; i < sb.length() ; i++) {
			System.out.print(sb.substring(i, sb.length()));
			System.out.println(sb.substring(0, i));
		}
		System.out.println(sb);
	}
}
