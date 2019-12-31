package ArrayPractice;

public class section39_2 {

	public static void main(String[] args) {
		
		
		for(int i = 1; i<= 5 ; i++) {
			for(int j = 1 ; j<=i ; j++) {
				System.out.print(String.format("%2d ", i*(i+1)/2 - (j-1)));
			}
			System.out.println();
		}

	}

}
