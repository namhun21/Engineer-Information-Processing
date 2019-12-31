package basic_Algorithm_math;
import java.util.*;
public class section30 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] num = new int[12];
		int[] answer = new int[14];
		Arrays.fill(answer,0);
		int carry = 0;
		do {
			
			for(int i = 0; i< num.length ; i++) {
				System.out.print("num["+i+"] : ");
				num[i] = stdIn.nextInt();
			}
			
			for(int i = 0 ; i< num.length ; i++)
				answer[i] += num[i];
			
			for(int j = num.length -1; j>0 ; j--) {
				if(answer[j]>9) {
					carry = answer[j] / 10;
					answer[j] %= 10;
					answer[j-1] += carry;
				}
				else
					carry = 0;

			}

		}while(num[0] !=0);
		
		System.out.print("answer : ");
		for(int i: answer)
			System.out.print(i);

	}

}
