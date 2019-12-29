package basic_Algorithm;

public class section10_1 { // 홀수의 합 구하기

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		for( i = 1 ; i<101 ; i+=2) {
			sum += i;
		}
		System.out.println(i + " " + sum);

	}

}
