package basic_Algorithm;

public class section15 { //�Ǻ���ġ������ ��

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		int sum = 2;
		int num = 0;
		for(int i = 2 ; i< 20 ; i++) {
			num = num1 + num2;
			num1 = num2;
			num2 = num;
			sum += num;
		}
		System.out.println(sum);

	}

}
