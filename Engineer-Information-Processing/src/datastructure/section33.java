package datastructure;
import java.util.*;
public class section33 { //insertionsort

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] num = new int[5];
		
		for(int i = 0; i< 5; i++) {
			System.out.print("num["+i+"] : ");
			num[i] = stdIn.nextInt();
		}
		InsertionSort(num);
		for(int i:num)
			System.out.print(i);
	}
	
	static void InsertionSort(int[] arr) {
		for(int i = 1; i< arr.length ; i++) {
			for(int j = i-1 ; j>-1 ; j--) {
				if(arr[j]>arr[j+1])
					swap(arr,j,j+1);
			}
		}
	}
	static void swap(int[] arr, int idx1, int idx2) {
		int tmp;
		tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
}
