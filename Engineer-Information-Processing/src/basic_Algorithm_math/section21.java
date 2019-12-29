package basic_Algorithm_math;
import java.util.*;
public class section21 { //소인수분해 x를 2부터 x의 제곱근까지 나누어떨어지는지

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[100];
		int num =0 , j = 0 , mok = 0 , nmg = 0, i;
		System.out.print("num : ");
		num = stdIn.nextInt();
		
		while(Math.sqrt(num)> 2) {
			for(i = 2; i<= (int)Math.sqrt(num); i++) {
				mok = num / i;
				nmg = num % i;
				if(nmg == 0) {
					a[j++] = i;
					num = mok; 
					break;
				}
				
			}
			if(i > (int)Math.sqrt(num)) {
				a[j++] = num;
				break;
			}
		}
		
		for(int k = 0 ;k< j ; k++) {
			System.out.print(a[k] + " ");
		}
	}

}
