package basic_Algorithm_math;

public class section26 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		for(int i = 5 ; i<= 100 ; i+=5) {
			sum += i;
			num++;
		}
		System.out.println(sum + " "+num);
	}

}
