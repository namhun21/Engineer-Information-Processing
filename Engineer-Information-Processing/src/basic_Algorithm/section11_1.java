package basic_Algorithm;

public class section11_1 { // °ö¼À¹öÀü

	public static void main(String[] args) {
		long i = 1;
		long sum = 1;
		for(i = 1; i< 30 ; i++) {
			if(i % 2 ==0)
				sum *= i;
			else
				sum *= -1*i;
			
		}
		System.out.println(i + " " + sum);

	}

}
