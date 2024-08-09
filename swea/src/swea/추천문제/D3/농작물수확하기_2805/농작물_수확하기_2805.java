package swea.추천문제.D3.농작물수확하기_2805;

import java.util.Scanner;

public class 농작물_수확하기_2805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int size = sc.nextInt();
			int[][] arr = new int[size][size];
			for (int i = 0; i < size; i++) {
				String num = sc.next();
				for (int j = 0; j < size; j++) {
					arr[i][j] = Integer.parseInt(num.substring(j, j + 1));

				}

			}
			int sum = 0;
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (i <= size / 2) {
						if (j < size / 2 - i || j >= size - size / 2 + i)
							continue;
						sum += arr[i][j];
					} else {
						if (j < i - size / 2 || j >= size - i + size / 2)
							continue;
						sum += arr[i][j];
					}
				}
			}
			System.out.println("#" + tc + " " + sum);
		}
	}

}
