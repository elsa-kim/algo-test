package 추천문제.실버;

import java.util.Scanner;

public class 크로아티아_알파벳_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alphabet = sc.next();
		alphabet = alphabet.replaceAll("=", "");
		alphabet = alphabet.replaceAll("-", "");
		String[] arr = alphabet.split("");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("d") && i+1<arr.length&& arr[i+1].equals("z")) {
				arr[i+1]=".";
			}else if (arr[i].equals("n") && i+1<arr.length&& arr[i+1].equals("j")) {
				arr[i+1]=".";
			}else if (arr[i].equals("l") && i+1<arr.length&& arr[i+1].equals("j")) {
				arr[i+1]=".";
			}
			
		}
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(!arr[i].equals(".")) cnt++;
			
		}
		System.out.println(cnt);
	}
}
