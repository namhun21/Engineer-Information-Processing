package basic_Algorithm;

public class section11 { // �汝� 曄熱 , 礎熱 擠熱 м啗

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		for(i = 1 ; i< 101 ; i++) {
			if(i % 2 == 0)
				sum -= i;
			else
				sum += i;
		}
		System.out.println(i + " " + sum);

	}

}
