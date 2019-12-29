package basic_Algorithm;

public class section13_1 {

	public static void main(String[] args) {
		int i = 0;
		int num = 1;
		int sum = 1;
		for(i =2; i< 21; i++) {
			num += i;
			sum += num;
		}
		System.out.println(i + " "+ sum);
	}

}
