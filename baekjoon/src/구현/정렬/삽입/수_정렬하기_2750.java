package 구현.정렬.삽입;

import java.util.Arrays;
import java.util.Scanner;

public class 수_정렬하기_2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i=1; i<size; i++) {
			int idx = 0;
			for (int j=0; j<i; j++) {
				if(arr[i]<arr[j]) {
					idx = j;
					break;
				}
			}
			int[] sortingArr = Arrays.copyOfRange(arr, idx,i-1);
			arr[idx] = arr[i];
			for(int j=0;j<sortingArr.length;j++) {
				arr[idx+1] = sortingArr[j];
			}
		}
		for(int i=0; i<size; i++) {
			System.out.println(arr[i]);
		}
	}
}
