package swea.추천문제.D3;
import java.util.Scanner;

public class 원재의_메모리_복구하기_1289 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++){
			String[] origin = sc.next().split("");
			
			int cnt = 0;
			String now = "0";
			for (int i=0; i<origin.length; i++) {
				if(!origin[i].equals(now)) {
					cnt++;
					now=origin[i];
				}
			}
			System.out.println("#"+test_case+" "+cnt);
		}
	}
}
