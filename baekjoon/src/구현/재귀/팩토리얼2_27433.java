package 구현.재귀;

import java.math.BigInteger;
import java.util.Scanner;

public class 팩토리얼2_27433 {
	public static BigInteger factorial(long N) {
		if(N<1)return BigInteger.valueOf(1);
		BigInteger r = BigInteger.valueOf(N).multiply(factorial(N-1));
		return r;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigInteger n = BigInteger.valueOf(N);
		BigInteger result = factorial(N+1).divide(n.add(BigInteger.valueOf(1)));
		
		System.out.println(result);
	}
}
