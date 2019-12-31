package datastructure;
import java.util.*;
public class section34 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] score = new int[5];
		int[] rank = new int[5];
		Arrays.fill(rank, 1);
		
		for(int i = 0; i< score.length ; i++) {
			System.out.print("score["+i+"] :");
			score[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i< score.length-1 ; i++) {
			for(int j = i+1; j< score.length ; j++) {
				if(score[i]< score[j])
					rank[i]++;
				else if(score[i]> score[j])
					rank[j]++;
			}
		}
		for(int i : rank)
			System.out.print(i);
	}

}
