package 추천문제.실버;

import java.util.Scanner;

public class 색종이_2563 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[][] arr = new int[cnt][2];
		for(int i=0; i<cnt; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		int sum = cnt*100;
		for(int i=0; i<cnt; i++) {
			for(int j=i+1; j<cnt; j++) {
				if(arr[i][0]-arr[j][0]>=0 && arr[i][0]-arr[j][0]<10) {
					if(arr[i][1]-arr[j][1]>=0 && arr[i][1]-arr[j][1]<10) {
						sum-=((10-arr[i][1]+arr[j][1])*(10-arr[i][0]+arr[j][0]));
					}else if(arr[j][1]-arr[i][1]>=0 && arr[j][1]-arr[i][1]<10) {
						sum-=((10-arr[j][1]+arr[i][1])*(10-arr[i][0]+arr[j][0]));
					}
				}else if(arr[j][0]-arr[i][0]>=0 && arr[j][0]-arr[i][0]<10) {
					if(arr[i][1]-arr[j][1]>=0 && arr[i][1]-arr[j][1]<10) {
						sum-=((10-arr[i][1]+arr[j][1])*(10-arr[j][0]+arr[i][0]));
					}else if(arr[j][1]-arr[i][1]>=0 && arr[j][1]-arr[i][1]<10) {
						sum-=((10-arr[j][1]+arr[i][1])*(10-arr[j][0]+arr[i][0]));
					}
				}
			}
			
		}
		System.out.println(sum);
	}
}
