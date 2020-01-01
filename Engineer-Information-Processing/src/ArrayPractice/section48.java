package ArrayPractice;

public class section48 {

	public static void main(String[] args) {
		int num = 1;
		int[][] arr = new int[5][5];
		int row = 0;
		int col = arr.length / 2;
		
		do {
			int preRow = row;
			int preCol = col;
			arr[row--][col++] = num++;
			if(row <0)
				row = 4;
			if(col>4)
				col = 0;
			if(arr[row][col] != 0) {
				row = preRow + 1;
				col = preCol;
			}
			
		}while(num<=25);
		
		for(int i = 0; i< 5 ; i++) {
			for(int j = 0; j<5;j++) {
				System.out.print(String.format("%2d ", arr[i][j]));
			}
			System.out.println();
		}

	}

}
