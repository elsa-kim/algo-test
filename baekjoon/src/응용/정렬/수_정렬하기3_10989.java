package 응용.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 수_정렬하기3_10989 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
//		int[] countingArr = new int[100];
//		for(int i=0; i<size; i++) {
//			while(arr[i]>countingArr.length) {
//				int[] newArray = Arrays.copyOf(countingArr, countingArr.length*2);
//				countingArr = newArray;
//			}
//				countingArr[arr[i]]++;
//				
//			
//		}
//		
//		for(int i=0; i<countingArr.length; i++) {
//			int cnt = countingArr[i];
//			if(cnt==0)continue;
//			for(int j=0; j<cnt;j++) {
//				System.out.println(i);
//			}
//		}
		
	}
}
