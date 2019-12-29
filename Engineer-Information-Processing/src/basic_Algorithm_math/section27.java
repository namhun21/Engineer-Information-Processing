package basic_Algorithm_math;
import java.util.*;
public class section27 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] arr = new int[10];
		int target = 0;
		int answer = 0;
		int index = 0;
		int diff = 10;
		for(int i = 0; i<10 ; i++) {
			System.out.print("arr["+i+"]: ");
			arr[i] = stdIn.nextInt();
		}
		System.out.print("target : ");
		target = stdIn.nextInt();
		
		for(int i = 0 ; i< 10 ; i++) {
			if(diff >= (int)Math.abs(target - arr[i])) {
				diff = (int)Math.abs(target - arr[i]);
				answer = arr[i];
				index = i;
			}
		}
		System.out.println(answer + " " + index);
	}

}
