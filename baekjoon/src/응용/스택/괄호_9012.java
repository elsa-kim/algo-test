package 응용.스택;

import java.util.Scanner;
import java.util.Stack;

public class 괄호_9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for(int test_case=1; test_case<=T; test_case++) {
			boolean VPS = true;
			String test = sc.next();
			char[] charArray = test.toCharArray();
			Stack<Integer> stack = new Stack<>();
			for (int i=0; i<test.length(); i++) {
				if (charArray[i]=='(') {
					stack.push(1);
				}else {
					if(stack.size()>0) {
						stack.pop();
					}else {
						VPS = false;
					}
				}
			}
			if(stack.size()>0) VPS=false;
			System.out.println(VPS?"YES":"NO");
		}
	}
}
