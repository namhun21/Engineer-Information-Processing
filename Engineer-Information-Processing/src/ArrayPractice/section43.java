package ArrayPractice;
import java.util.*;

public class section43 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num = 1;
		int size = 0;
		System.out.print("size : ");
		size = stdIn.nextInt();
		int[][] arr = new int[size][size];
		int mid = size /2;
		for(int i = 0 ; i< size ; i++) {
			if( size - i > mid) {
				for(int j = 0 ; j< size -i ; j++) 
					arr[i][j] = num++;
			}
			else {
				for(int j = 0 ; j<= i ; j++) 
					arr[i][j] = num++;
			}
		}
		
		for(int i = 0 ; i< size ; i++) {
			for(int j = 0; j<size ; j++){
				if(arr[i][j] != 0)
					System.out.print(String.format("%2d ", arr[i][j]));
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}

}
