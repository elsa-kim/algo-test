package 추천문제.브론즈;

import java.util.Scanner;

public class 직사각형을_만드는_방법_8320 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				if(i*j<=n) cnt++;
			}
		}
		System.out.println(cnt);
	}

}
