package swea.추천문제.forA.SWEA_5215_햄버거다이어트;

import java.util.Scanner;

public class 부분집합ver {
	static int count, maxC;
	static int[][] origin;
	static boolean[] arr;
	static int maxT;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			count = sc.nextInt();
			maxC = sc.nextInt();
			origin = new int[count][2];
			arr = new boolean[count];
			maxT = 0;
			for (int i = 0; i < count; i++) {
				origin[i][0] = sc.nextInt();
				origin[i][1] = sc.nextInt();
			}

			com(0, 0, 0);
			System.out.println("#" + tc + " " + maxT);
		}
	}

	private static void com(int cnt, int sumT, int sumC) {
		if (sumC > maxC) {
			return;
		}

		if (cnt == count) {
			if (sumT > maxT)
				maxT = sumT;
			return;
		}

		arr[cnt] = true;
		com(cnt + 1, sumT + origin[cnt][0], sumC + origin[cnt][1]);

		arr[cnt] = false;
		com(cnt + 1, sumT, sumC);
	}
}
