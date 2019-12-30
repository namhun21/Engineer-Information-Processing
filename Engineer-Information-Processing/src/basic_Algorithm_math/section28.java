package basic_Algorithm_math;
import java.util.*;
public class section28 { //1의 보수 , 2의 보수

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] num = new int[5];
		for(int i = 0; i< 5 ; i++) {
			System.out.print("num["+i+"] : ");
			num[i] = stdIn.nextInt();
		}

		getTwoBosu(num);

	}
	static void getOneBosu(int[] num) {
		for(int i = 0 ; i< num.length ; i++)
			num[i] = 1 - num[i];
		for(int i: num)
			System.out.print(i);
		System.out.println();
	}
	static void getTwoBosu(int[] num) {
		int carry = 0;
		for(int i = 0 ; i< num.length ; i++)
			num[i] = 1 - num[i];
		num[4]++;
		for(int j = num.length -1 ; j>0 ; j--) {
			if(num[j] == 2) {
				num[j] = 0;
				carry = 1;
				num[j-1] += carry;
			}else 
				carry = 0;
		
		}
		if(num[0] == 2)
			System.out.println("OverFlow");
		else {
			for(int i = 0 ; i< num.length ; i++)
				System.out.print(num[i]);
		}
		System.out.println();
	}

}
