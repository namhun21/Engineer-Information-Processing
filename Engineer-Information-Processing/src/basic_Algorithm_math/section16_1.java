package basic_Algorithm_math;
import java.util.Scanner;
public class section16_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = 0;
		int i = 0;
		do {
			System.out.print("n :");
			n = stdIn.nextInt();
		}while(n<2);
		
		for( i = 2; i< n ; i++) {
			if(n % i == 0) {
				System.out.println("소수아님");
				break;
			}
		}
		if(n == i )
			System.out.println("소수");

	}

}
