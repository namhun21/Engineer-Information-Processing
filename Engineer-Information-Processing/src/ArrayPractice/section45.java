package ArrayPractice;
import java.util.*;
public class section45 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num = 1;
		int[][] arr = new int[5][5];
		int[][] arr2 = new int[5][5];
		for(int i = 4 ; i>-1 ; i--) {
			for(int j = i; j< 5; j++) {
				arr[i][j] = num++;
			}
		}
		printArray(arr);
		System.out.println();
		rotate(arr,arr2);
		printArray(arr2);

	}
	static void printArray(int[][] a) {
		for(int i = 0; i< a.length;i++) {
			for(int j = 0; j< a[i].length;j++) {
				if(a[i][j] != 0)
					System.out.print(String.format("%2d ", a[i][j]));
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		
	}
	
	static void rotate(int[][] a,int [][] b) {
		for(int i = 0 ; i< a.length ; i++) {
			for(int j = i ; j< a[i].length ; j++) {
				b[j][4-i] = a[i][j];
			}
		}
	}

}
