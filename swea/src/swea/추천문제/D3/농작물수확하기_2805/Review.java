package swea.추천문제.D3.농작물수확하기_2805;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();

			int[][] board = new int[N][N];

			for (int i = 0; i < N; i++) {
				String line = sc.next();
				for (int c = 0; c < N; c++) {
					board[i][c] = line.charAt(c) - '0';
				}
			}

			int sum = 0;

			int start = N / 2;
			int end = N / 2;

			for (int r = 0; r < N; r++) {
				for (int c = start; c <= end; c++) {
					sum += board[r][c];
				}
				if (r < N / 2) {
					start--;
					end++;
				} else {
					start++;
					end--;
				}

			}
			System.out.println("#" + tc + " " + sum);
		}

	}
}
