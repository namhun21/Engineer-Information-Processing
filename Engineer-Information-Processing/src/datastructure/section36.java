package datastructure;
import java.util.*;
public class section36 {

	public static void main(String[] args) {
		int[] a = {1,3,5,6,0};
		int[] b = {2,3,5,8,9,10,12,13,0};
		int[] c = new int[20];
		int cnta = 0;
		int cntb = 0;
		int cntc = 0;
		
		while( a[cnta] !=0  && b[cntb] != 0) {
			if(a[cnta] < b[cntb]) 
				c[cntc++] = a[cnta++];
			else 
				c[cntc++] = b[cntb++];
		}
		if(a[cnta] == 0) {
			while(b[cntb] !=0)
				c[cntc++] = b[cntb++];
		} else if(b[cntb] ==0) {
			while(a[cnta] !=0)
				c[cntc++] = a[cnta++];
		}
		c[cntc] = 0;
		
		for(int i= 0 ; i< cntc+1 ; i++)
			System.out.print(c[i]);
		
	}

}
