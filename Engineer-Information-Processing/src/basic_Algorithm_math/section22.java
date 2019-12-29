package basic_Algorithm_math;
import java.util.*;
public class section22 { // 진법변환

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num = 0;
		Stack<Integer> st = new Stack<Integer>();
		System.out.print("num : ");
		num = stdIn.nextInt();
		while(num != 0) {
			st.push(num % 2);
			num /= 2;
		}
		
		while(!st.isEmpty())
			System.out.print(st.pop());
	}

}
