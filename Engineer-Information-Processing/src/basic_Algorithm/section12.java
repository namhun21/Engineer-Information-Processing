package basic_Algorithm;

public class section12 { // 분수 합계

	public static void main(String[] args) {
		int i = 0;
		double sum = 0;
		while(i<100) {
			i++;
			if(i % 2 !=0)
				sum += (double)(-1)*(i/(i+1));
			else
				sum += (double)i/(i+1);
		}
		System.out.println(i + " "+ String.format("%.3f",sum));
	}

}
