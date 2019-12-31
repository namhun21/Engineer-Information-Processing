package datastructure;
import java.util.*;
public class section31 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] num = new int[5];
		for(int i= 0; i< 5 ; i++) {
			System.out.print("num["+i+"] : ");
			num[i] = stdIn.nextInt();
		}
		SelectionSort(num);
		for(int i: num)
			System.out.print(i);
		
	}
	static void SelectionSort(int[] arr) {
		for(int i = 0 ; i< arr.length-1 ; i++) {
			for(int j = i + 1 ; j< arr.length; j++) {
				if(arr[i]> arr[j])
					swap(arr,i,j);
			}
		}
	}
	static void swap(int[] a ,int idx1, int idx2) {
		int tmp;
		tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}
}
