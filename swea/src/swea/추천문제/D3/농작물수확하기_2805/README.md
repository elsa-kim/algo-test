## 농작물 수확하기 문제풀이
[농작물 수확하기](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV7GLXqKAWYDFAXB)
1. 열번호 범위 지정 _ Review 코드
    - for문에서 열을 다 돌지말고 행 인덱스에 따라 범위 바꿔주기
2. 중앙 지점과 거리 차이(맨해튼)가 N/2 이하인 칸 더해주기
    - 거리 측정 방식
        1. 맨해튼 거리 : 행의 차이 + 열의 차이
        2. 유클리디안 거리 : 두 지점의 직선거리
    - 거리 지점 차의 절대값을 더한 후 비교 : `Math.abs(r1 - r2) + Math.abs(c1 - c2) <= N / 2`

### charAt()
- 인풋값이 붙어있는 숫자로 제공되기 때문에 `String line = sc.next()`로 받고 for문 돌며 `line.charAt(i)` 사용해 배열에 넣어주기
- `line.charAt(i)` 사용 시 문자 '0' 빼주기 = > 왜? : 아스키코드로 나오기때문
    - `board[r][c] = line.charAt(c) - '0'`

### Arrays.deepToString(배열명)
2차원 배열 값 배열 형태로 보여줌

### Scanner
입력받는 방법 배우는 게 아니기 때문에 Scanner 쓰기
입력 어떻게 받았나로 당락 결정되지 않음
BufferedReader 사용안하고 풀기(시험 때 써도 상관없음)
#### 테스트케이스 파일로 인풋하기
1. 만든 프로젝트에 파일 넣기(src가 아닌 프로젝트 폴더)
2. `Scanner(System.in)` 대신 `Scanner(new File(파일명))` => main 메소드에 `throws FileNotFoundException` 적어주기
3. 주의할 점 : SWEA에 코드 제출 시 다시 `Scanner(System.in)`으로 바꿔주기
