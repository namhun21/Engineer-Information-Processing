package basic_Algorithm_math;
import java.util.Scanner;
public class section19 { // 최대공약수, 최소공배수 (유클리드 호제법)
	static int GCM(int a, int b) {
		int max = (a>= b)? a:b;
		int min = (a < b)? a:b;
		int nmg = -1;
		while(nmg!=0) {
			nmg = max % min;
			max = min;
			min = nmg;
		}
		return max;
	}
	static int LCM(int a, int b, int gcm) {
		int num = a * b;
		return num / gcm;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num1, num2;
		int gcm , lcm;
		System.out.print("num1 :");
		num1 = stdIn.nextInt();
		System.out.print("num2 :");
		num2 = stdIn.nextInt();
		gcm = GCM(num1,num2);
		lcm = LCM(num1,num2,gcm);
		System.out.println(gcm+ " " + lcm);

	}

}
