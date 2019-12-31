package ArrayPractice;

public class section39_1 {

	public static void main(String[] args) {
		int num =1;
		for(int i =5 ; i>=1 ; i--) {
			for(int j = 1 ; j<=5 ; j++) {
				if(j>=i)
					System.out.print(String.format("%2d ", num++));
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}

}
