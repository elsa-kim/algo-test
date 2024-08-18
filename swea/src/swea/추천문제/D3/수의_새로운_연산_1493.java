package swea.추천문제.D3;

import java.util.Arrays;
import java.util.Scanner;

public class 수의_새로운_연산_1493 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ay = 1;
            int by = 1;
            int ax = 1;
            int bx = 1;
            
            for(int i=1; i<=142; i++) {
            	if(a >= (i-1)*i/2 + 1) {
            		ay = i;
            	} 
            	if(b >= (i-1)*i/2 + 1) {
            		by = i;
            	}
            }
            ax += a - ((ay-1)*ay/2 + 1);
            ay -= a - ((ay-1)*ay/2 + 1);
            bx += b - ((by-1)*by/2 + 1);
            by -= b - ((by-1)*by/2 + 1);
            
            long ans = (ax+bx+ay+by-2)*(ax+bx+ay+by-1)/2 +ax+bx;
            System.out.println("#"+test_case+" "+ans);
            
           
		}
	}
}
