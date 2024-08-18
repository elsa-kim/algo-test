package swea.추천문제.forA.SWEA_2817_부분수열의합;

import java.util.Scanner;

public class 부분집합ver {
	static int N, K, count;
	static int[] origin;
	static boolean[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			K = sc.nextInt();
			count = 0;
			origin = new int[N];
			arr = new boolean[N];
			for (int i = 0; i < N; i++) {
				origin[i] = sc.nextInt();
			}
			com(0, 0);
			System.out.println("#" + tc + " " + count);
		}
	}

	private static void com(int cnt, int sum) {
		if (sum > K) {
			return;
		}
		if (cnt == arr.length) {
			if (sum == K)
				count++;
			return;
		}

		arr[cnt] = true;
		com(cnt + 1, sum + origin[cnt]);
		arr[cnt] = false;
		com(cnt + 1, sum);

	}
}
