package ArrayPractice;
import java.util.*;
public class section42 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int size = 0;
		int num = 1;
		System.out.print("size : ");
		size = stdIn.nextInt();
		
		int[][] arr = new int[size][size];
		int s = 0;
		int e = arr.length-1;
		int mid = arr.length /2;
		for(int i = 0 ; i< arr.length ; i++) {
			for(int j = s ; j<= e ; j++) {
				arr[i][j] = num++;
			}
			if(i < mid) {
				s = s +1;
				e = e -1;
			}
			else {
				s = s -1;
				e = e+1;
			}
				
		}
		
		for(int i = 0; i< size ; i++) {
			for(int j = 0 ; j<size ; j++) {
				if(arr[i][j] != 0)
					System.out.print(String.format("%2d ", arr[i][j]));
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		

	}

}
