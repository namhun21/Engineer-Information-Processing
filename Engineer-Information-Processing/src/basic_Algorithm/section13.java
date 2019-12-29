package basic_Algorithm;
import java.util.Scanner;
public class section13 { // 계차수열 합

	public static void main(String[] args) {
		int i = 0;
		int num = 1;
		int n = 0;
		int sum = 1;
		Scanner stdIn = new Scanner(System.in);
		System.out.print("n : ");
		n = stdIn.nextInt();
		for(i = 1; i< n  ; i++ ) {
			num += i;
			sum += num;
		}
		System.out.println( i + " " + sum);

	}

}
