package basic_Algorithm_math;
import java.util.*;
public class section23 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num = 0;
		int trans = 0;
		String s = "0123456789ABCDEF";
		Stack<Character> st = new Stack<Character>();
		System.out.print("num : ");
		num = stdIn.nextInt();
		System.out.print("�������� ��ȯ? (16�������� ����)");
		trans = stdIn.nextInt();
		while(num != 0) {
			st.push(s.charAt(num % trans));
			num /= trans;
		}
		while(!st.isEmpty())
			System.out.print(st.pop());
	}

}
