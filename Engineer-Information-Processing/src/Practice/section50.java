package Practice;
import java.util.*;
public class section50 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String name = "";
		int money = 0;
		int num = 50000;
		int[] bill = {50000,10000,5000,1000,500,100,50,10,5,1};
		int[] cnt = new int[10];
		int i = 0;
		
		
		System.out.print("Money : ");
		money = stdIn.nextInt();
		
		while(money!=0) {
			
			cnt[i] = money / bill[i];
			
			money = money % bill[i];
			
			i++;
		}
		
		
		for(int j = 0; j< cnt.length ; j++)
			System.out.print(String.format("%2d ", cnt[j]));
	}

}
