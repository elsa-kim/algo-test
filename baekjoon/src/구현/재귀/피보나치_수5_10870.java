package 구현.재귀;

import java.util.Scanner;

public class 피보나치_수5_10870 {
	
	public static int getNextN(int N) {
		if(N==0) return 0;
		if (N==1) return 1;
		return getNextN(N-1)+getNextN(N-2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getNextN(n));
	}
}
