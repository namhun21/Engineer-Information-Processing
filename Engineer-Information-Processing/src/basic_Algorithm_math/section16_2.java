package basic_Algorithm_math;
import java.util.Scanner;
public class section16_2 { //������ �̿�

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print("n :");
			n = stdIn.nextInt();
		}while(n<2);
		
		for(int i = 2 ; i<= (int)Math.sqrt(n);i++) {
			if(n % i == 0) {
				System.out.println("�Ҽ��ƴ�");
				return;
			}
		}
		System.out.println("�Ҽ�");
	}

}
