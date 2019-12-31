package ArrayPractice;

public class section38_1 {

	public static void main(String[] args) {
		int num = 1;
		for(int i = 1 ; i<=5 ; i++) {
			for(int j = 1; j<=5 ; j++) {
				System.out.print(String.format("%3d ", i + 5*(j-1)));
			}
			System.out.println();
		}

	}

}
