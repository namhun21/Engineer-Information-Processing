package basic_Algorithm;

public class section14 { // 팩토리얼들 합

	public static void main(String[] args) {
		/*
		int i = 0;
		int sum = 0;
		
		while( i < 10) {
			i++;
			sum += factorial(i);
		}
		System.out.println(i + " " + sum);
	}
	static int factorial(int n) {
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}*/
		int i = 1;
		int num = 1;
		int sum = 1;
		while(i<10) {
			i++;
			num *= i;
			sum += num;
		}
		System.out.println(i + " " + sum);
	}
}
