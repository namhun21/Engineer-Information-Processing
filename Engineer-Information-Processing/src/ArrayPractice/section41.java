package ArrayPractice;

import java.util.Arrays;

public class section41 {

	public static void main(String[] args) {
		int num = 1;
		int[][] arr = new int [5][5];
		int s = arr.length /2;
		int e = arr.length /2;
		
		int mid = arr[0].length /2;
		for(int i = 0; i< 5; i++) {
			for(int j = s ; j<=e ; j++) {
				arr[i][j] = num++;
				
			}
			if(i<mid) {
				s = s -1;
				e = e+1;
			}
			else {
				s = s+1;
				e = e-1;
			}
		}
		
		for(int i = 0; i< 5; i++) {
			for(int j = 0; j< 5; j++) {
				if(arr[i][j] != 0)
					System.out.print(String.format("%2d ", arr[i][j]));
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}

}
