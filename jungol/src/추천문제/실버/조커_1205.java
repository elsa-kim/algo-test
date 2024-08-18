package 추천문제.실버;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class 조커_1205 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Set<Integer> num = new HashSet<>();
		int zeroCnt = 0;
		for(int i=0; i<n; i++) {
			if(arr[i]==0) {
				zeroCnt++;
			}else {
				num.add(arr[i]);
			}
		}
		arr = new int[num.size()];
		Iterator<Integer> it = num.iterator();
		for(int i=0; i<num.size(); i++) {
			arr[i] = it.next();
		}
		Arrays.sort(arr);
		
		// 진행중
		
	}
}
