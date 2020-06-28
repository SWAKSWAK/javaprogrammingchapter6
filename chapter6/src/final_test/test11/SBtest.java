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
			System.out.print("���:");
			String str = sc.nextLine();//a!b -> a �� b �� �ٲ�
			
			if (str.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				sc.close();
				return;
			}
			
			st = new StringTokenizer(str, "!");// ! �� �������� ��ū ����
			if (st.countTokens() != 2) { // ��ū ���� 2���� �ƴϸ� !�� �������� ����� ������ �ʾҴٴ¶�
				System.out.println("�߸��� ��� �Դϴ�.");
				continue;
			}
			String left = st.nextToken();//!�� �������� ���� ��ū(ù��° ��ū) left �� ����
			String right = st.nextToken();//nextToken �� ���� �ּҰ����� �̵� �ϹǷ� �ڵ������� �ι�° �� ����
			int index = sb.indexOf(left);//��Ʈ�� ���۷� ���� ���ڿ����� left(������ū��)�� ���� ���ڸ� ã�� �� �ε����� index�� ����
			if (index == -1) {//�ش��ϴ� ���ڿ� ��ġ�ϴ� ���� ������ -1�� �����ϰԵǾ�����
				System.out.println("ã�� �� �����ϴ�.");
				continue;
			}
			
			sb.replace(index, index+left.length(), right);
			System.out.println(sb);
		}
	}
}
