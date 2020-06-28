package final_test.test11;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SBtest {
	public static void main(String[] args) {
		StringBuffer sb;
		Scanner sc = new Scanner (System.in);
		StringTokenizer st;
		
		System.out.print(">>");
		sb = new StringBuffer(sc.nextLine());
		
		while(true) {
			System.out.print("명령:");
			String str = sc.nextLine();//a!b -> a 를 b 로 바꿈
			
			if (str.equals("그만")) {
				System.out.println("종료합니다.");
				sc.close();
				return;
			}
			
			st = new StringTokenizer(str, "!");// ! 를 기준으로 토큰 나눔
			if (st.countTokens() != 2) { // 토큰 수가 2개가 아니면 !를 기준으로 제대로 나누지 않았다는뜻
				System.out.println("잘못된 명령 입니다.");
				continue;
			}
			String left = st.nextToken();//!를 기준으로 왼쪽 토큰(첫번째 토큰) left 에 저장
			String right = st.nextToken();//nextToken 은 다음 주소값으로 이동 하므로 자동적으로 두번째 값 리턴
			int index = sb.indexOf(left);//스트링 버퍼로 받은 문자열에서 left(왼쪽토큰값)와 같은 문자를 찾고 그 인덱스값 index에 받음
			if (index == -1) {//해당하는 문자와 일치하는 값이 없으면 -1을 리턴하게되어있음
				System.out.println("찾을 수 없습니다.");
				continue;
			}
			
			sb.replace(index, index+left.length(), right);
			System.out.println(sb);
		}
	}
}
