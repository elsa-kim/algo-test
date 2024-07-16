package 구현.스택;

import java.util.Scanner;

public class 스택_10828_2 {
	static int[] numArray = new int[0];
	static int[] newArray;
	public static void push(int pushNum) {
		newArray = new int[numArray.length+1];
		for(int j=0; j<numArray.length; j++) {
			newArray[j] = numArray[j];
		}
		newArray[numArray.length] = pushNum;
		numArray = newArray;
	}
	
	public static void top() {
		if (numArray.length==0) {
			System.out.println("-1");
		}else {
			System.out.println(numArray[numArray.length-1]);
		}
	}
	
	public static void pop() {
		if (numArray.length==0) {
			System.out.println("-1");
		}else {
			System.out.println(numArray[numArray.length-1]);
			newArray = new int[numArray.length-1];
			for(int j=0; j<numArray.length-1; j++) {
				newArray[j] = numArray[j];
			}
			numArray = newArray;
			
		}
	}
	
	public static void size() {
		System.out.println(numArray.length);
	}
	
	public static void empty() {
		if(numArray.length==0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for (int i=0; i<test; i++) {
			String order = sc.next();
			if (order.equals("push")) {
				int pushNum;
				pushNum = sc.nextInt();
				push(pushNum);
			}else if(order.equals("top")) {
				top();
			}else if (order.equals("pop")) {
				pop();
			}else if(order.equals("size")) {
				size();
			}else if(order.equals("empty")) {
				empty();
			}
		}
	}
}
