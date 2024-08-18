package swea.추천문제.D2.백만장자프로젝트_1859;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();

			int[] price = new int[N];

			for (int i = 0; i < N; i++) {
				price[i] = sc.nextInt();
			}
			long answer = 0;
			int[] max = new int[N];
			max[N - 1] = price[N - 1];
			for (int i = N - 2; i >= 0; i--) {
				max[i] = Math.max(price[i], max[i + 1]);
				answer += max[i] - price[i];
			}
			System.out.println("#" + tc + " " + answer);

		}
	}
}
