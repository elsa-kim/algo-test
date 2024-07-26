package 추천문제.실버;

import java.util.Scanner;

public class 색종이2_2567 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[][] color = new int[cnt][2];
		
		for(int i=0; i<cnt; i++) {
			color[i][0] = sc.nextInt();
			color[i][1] = sc.nextInt();
		}
		int[][] getArr = new int[101][101];
//		for(int i=0; i<cnt; i++) {
//			for(int n=0; n<10; n++) {
//				for(int m=1; m<10; m++) {
//					if(n==0) continue;
//					getArr[color[i][0]+n][color[i][1]+m]=-1;
//				}
//				if(getArr[color[i][0]+n][color[i][1]]!=-1) {
//					getArr[color[i][0]+n][color[i][1]]=1;					
//				}
//				if(getArr[color[i][0]][color[i][1]+n]!=-1) {
//					getArr[color[i][0]][color[i][1]+n]=1;					
//				}
//				if(getArr[color[i][0]+10][color[i][1]+n]!=-1) {
//					getArr[color[i][0]+10][color[i][1]+n]=1;					
//				}
//				if(getArr[color[i][0]+n][color[i][1]+10]!=-1) {
//					getArr[color[i][0]+n][color[i][1]+10]=1;					
//				}
//				
//			}
//		}
		int sum = 0;
		for(int i=0; i<101; i++) {
			for(int j=0; j<101; j++) {
				if(getArr[i][j]==1) sum++;
			}
		}
		System.out.println(sum);
	}
}
