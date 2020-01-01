package ArrayPractice;

public class section47 {

	public static void main(String[] args) {
		int num = 1;
		int[][] arr = new int[5][5];
		int row = 0;
		int col = 0;
		int k = 0;
		
		while(num<26) {
			
			for(int i = col ; i>-1 ; i--) {
				if(row>4)
					break;	
				arr[row++][i] = num++;
			}
			
			if(row > 4) {
				row = ++k;
				col = 4;
			}
			else {
				 col = row;
				 row = 0;
			}
			
		}

		for(int i =0 ; i<5 ; i++) {
			for(int j = 0; j<5; j++)
				System.out.print(String.format("%2d ", arr[i][j]));
			System.out.println();
		}
	}

}
