package swea.추천문제.D3;

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
            
            for(int i=1; i<=100; i++) {
            	if(a >= (i-1)*i/2 + 1) {
            		ay = i;
            	} 
            	if(b >= (i-1)*i/2 + 1) {
            		by = i;
            	}
            }
            ax += a - ((ay-1)*ay/2 + 1);
            bx += b - ((by-1)*by/2 + 1);
            
           
            int ans = (ay+by-1)*(ay+by)/2 + 1+ax+bx-1;
            System.out.println("#"+test_case+" "+ans);
		}
	}
}
