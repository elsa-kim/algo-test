package swea.추천문제.D2;

import java.util.Arrays;
import java.util.Scanner;

public class 백만_장자_프로젝트_1859 {
	public static long getMoney(int[] arr) {
		long sum = 0;
		int bigIdx = 0;
        for(int i=0; i<arr.length; i++){
        	if(arr[i]>=arr[bigIdx]) bigIdx=i;
        }
        for(int i=0; i<bigIdx; i++){
        	sum+=arr[bigIdx]-arr[i];
        }
        System.out.println(sum);
        int[] seperateArr = Arrays.copyOfRange(arr, bigIdx+1, arr.length); 
        System.out.println(seperateArr.length+"!!");
        for(int n:seperateArr) {
        	System.out.println(n+"??");
        }
        if(seperateArr.length > 1) sum += getMoney(seperateArr);
        
        return sum;
	}
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int cnt = sc.nextInt();
            int[] arr = new int[cnt];
            for(int i=0; i<cnt; i++){
            	arr[i] = sc.nextInt();
            }
            
           long sum = getMoney(arr);
            
            System.out.println("#"+test_case+" "+sum);
			
		}
	}
}
