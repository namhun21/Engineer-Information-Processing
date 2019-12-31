package ArrayPractice;

public class section40 {

	public static void main(String[] args) {
		int num = 1;
		int[][] arr = new int[5][5]; 
		for(int i = 0 ; i<5; i++) {
			if(i%2 == 0) {
				for(int j = 0; j<5; j++)
					arr[i][j] = num++;
			}
			else {
				for(int j = 4; j>-1; j--)
					arr[i][j] = num++;
			}
		}
		for(int i = 0 ; i<5 ; i++) {
			for(int j = 0 ; j<5 ; j++)
				System.out.print(arr[i][j] + "  ");
			System.out.println();
		}
		
	}

}
