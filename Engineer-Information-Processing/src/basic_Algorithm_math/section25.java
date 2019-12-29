package basic_Algorithm_math;
import java.util.*;
public class section25 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] num = new int[10];
		for(int i = 0; i< 10 ; i++) {
			System.out.print("num[" + i +"] :");
			num[i] = stdIn.nextInt();
		}
		Arrays.sort(num);
		System.out.println("max = " +num[9] + " min = "+num[0]);
	}

}
