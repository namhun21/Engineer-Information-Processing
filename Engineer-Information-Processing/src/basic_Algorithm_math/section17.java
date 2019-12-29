package basic_Algorithm_math;
import java.util.*;
public class section17 { // 소수의 합 구하기

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = 0;
		int sum = 2;
		int i, j;
		do {
			System.out.print("n : ");
			n = stdIn.nextInt();
		}while(n<2);
		
		for( i = 3; i< n+1 ; i++) {
			for( j = 2; j<i; j++) {
				if(i % j == 0)
					break;
			}
			if(i == j)
				sum += i;
		}
		
		System.out.println(sum);

	}

}
