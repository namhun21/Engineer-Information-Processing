package basic_Algorithm_math;

import java.util.Scanner;

public class section18 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int cnt = 0;
		int n = 0;
		do {
			System.out.print("n :");
			n = stdIn.nextInt();
		}while(n<2);
		
		int[] array = new int[n+1];
		
		for(int i = 2; i< n+1 ;i++)
			array[i] = i;
		
		for(int i = 2 ; i< n+1 ; i++) {
			for(int j = i+ i; j< n+1; j+= i) {
				array[j] = 0;
			}
		}
		for(int i = 2; i< n+1; i++) {
			if(array[i] != 0)
				cnt++;
		}
		System.out.println("n사이의 소수의 개수 " + cnt);

	}

}
