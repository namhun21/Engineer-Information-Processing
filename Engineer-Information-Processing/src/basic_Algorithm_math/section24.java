package basic_Algorithm_math;
import java.util.*;
public class section24 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s;
		double sum = 0;
		System.out.print("s : ");
		s = stdIn.next();
		for(int i = 0; i< s.length() ; i++) {
			sum += (s.charAt(i) -'0')*Math.pow(2, 4-i);
		}
		System.out.println(sum);

	}

}
