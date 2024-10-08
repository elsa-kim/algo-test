package 응용.큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드2_2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1; i<=N; i++) {
			q.add(i);
		}
		while(q.size()!=1) {
			q.remove();
			q.add(q.element());
			q.remove();
		}
		System.out.println(q.element());
		
	}
}
