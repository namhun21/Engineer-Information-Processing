package basic_Algorithm;

public class section13_2 {

	public static void main(String[] args) {
		int i = 0;
		int num = 1;
		int sum = -1;
		for(i = 1 ; i<20 ; i++) {
			num += i;
			if(i % 2 != 0)
				sum += num;
			else
				sum += (-1)*num;
		}
		System.out.println(i+ " " + sum);
	}

}
