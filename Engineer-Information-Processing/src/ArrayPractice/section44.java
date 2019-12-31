package ArrayPractice;
import java.util.*;
public class section44 {

	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		int num = 1;
		int col = 0;
		int row = 0;
		System.out.print("col : ");
		col = stdIn.nextInt();
		row = col*2 -1;
		int s = row/ 2;
		int e = row/ 2;
		int[][] arr = new int[row][col];
		
		
		for(int i = 0 ; i< col ; i++) {
			for(int j = s ; j<=e ; j++) {
				arr[j][i] = num++;
			}
			s = s - 1;
			e = e + 1; 
		}
		
		for(int i = 0 ; i< row ; i++) {
			for(int j = 0 ; j<col ; j++) {
				if(arr[i][j] != 0)
					System.out.print(String.format("%2d ", arr[i][j]));
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

}
