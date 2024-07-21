package 수학;

import java.util.Scanner;

public class 달팽이는_올라가고_싶다_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int up = sc.nextInt();
		int down = sc.nextInt();
		int tree = sc.nextInt();
		int day = (int) (Math.ceil((tree-up)*1.0/(up-down))+1);
		
		System.out.println(day);
	}
}
