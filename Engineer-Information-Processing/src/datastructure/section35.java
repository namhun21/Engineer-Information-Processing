package datastructure;
import java.util.*;
public class section35 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] num = {8,15,35,55,60,61,70,80,92,99};
		int start = 0;
		int end = num.length -1;
		int target = 0;
		int answer = -1;
		
		System.out.print("target : ");
		target = stdIn.nextInt();
		
		while(start<=end) {
			int mid = (start + end) / 2;
			if(num[mid] == target) {
				answer  = mid;
				break;
			}else if(num[mid]> target)
				end = mid -1;
			else
				start = mid +1;
				
		}
		if(answer == -1)
			System.out.println("Not Found");
		else
			System.out.println(answer);
		
	}

}
