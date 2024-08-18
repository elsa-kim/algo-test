## 순열

순서가 있는 수열.

```
public class 순열 {
	static int n; // 자연수 1~n까지의 수
	static int m; // m개 숫자 뽑기
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		per(0);
	}

    public static void per(int cnt) {
		if (cnt == m) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for (int i = 1; i <= n; i++) {
			arr[cnt] = i;
			per(cnt + 1);
		}

	}
}
```

## 조합

뽑은 수의 조합이 중복 없어야함 => [1, 2, 3]과 [3, 2, 1]은 동일

```
public class 조합 {
	static int n; // 자연수 1~n까지의 수
	static int m; // m개 숫자 뽑기
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		com(0, 1);
	}

    public static void com(int cnt, int start) {
		if(cnt == m) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int i=start; i<=n; i++) {
			arr[cnt] = i;
			com(cnt+1, i);

		}
	}
}
```

## 부분집합

수열의 여러가지 경우의 수 구할 때 유용

```
public class 부분집합ver {
	static int N, K, count;
	static int[] origin;
	static boolean[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        count = 0;
        origin = new int[N];
        arr = new boolean[N];
        for (int i = 0; i < N; i++) {
            origin[i] = sc.nextInt();
        }

        com(0, 0);

	}

	private static void com(int cnt, int sum) {
		if (sum > K) { // 합의 제한이 있을 경우 파라미터로 함께 보내 기저조건으로 확인 => 제한 넘으면 return 시켜 시간 감소시킴
			return;
		}
		if (cnt == arr.length) {
			if (sum == K)
				count++;
			return;
		}

        // 입력된 가능한 수들을 각각 true/false로 수열에 포함되는지 체크함으로써 부분집합 생성

        // 포함
		arr[cnt] = true;
		com(cnt + 1, sum + origin[cnt]);

        // 불포함
		arr[cnt] = false;
		com(cnt + 1, sum);

	}
}
```
