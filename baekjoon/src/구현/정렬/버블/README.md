# 버블 정렬(bubble sort)

### 개념
- 첫번째 항목과 두번째 항목, 두번째 항목과 세번째 항목, ..., (n-1)번째 항목과 n번째 항목을 비교하며 교환 
=> 1회전 후 가장 큰 수가 맨 뒤로 이동 
=> 2회전은 (n-1)까지 진행 => ... 

### 특징
#### 장점
- 구현이 매우 간단
#### 단점
- 순서에 맞지 않는 요소를 인접한 요소와 교환
- 하나의 요소가 가장 왼쪽에서 가장 오른쪽으로 이동하기 위해 배열의 모든 요소들과 교환해야 함
- 특정 요소가 최종 정렬 위치에 이미 있는 경우라도 교환되는 일이 발생
#### 시간복잡도
T(n) = O(n^2)