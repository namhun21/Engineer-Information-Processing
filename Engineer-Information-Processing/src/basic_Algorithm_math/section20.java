package basic_Algorithm_math;
import java.util.*;

public class section20 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num = 0;
		System.out.print("num :");
		num = stdIn.nextInt();
		for(int i = 1; i<=num/2 ; i++) {
			if(num % i == 0)
				System.out.print(i + " ");
		}
		System.out.println(num);
	}

}
