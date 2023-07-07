# [Bronze III] 중앙 이동 알고리즘 - 2903 

[문제 링크](https://www.acmicpc.net/problem/2903) 

### 성능 요약

메모리: 11456 KB, 시간: 76 ms

### 분류

수학

### 문제 설명

<p>상근이는 친구들과 함께 SF영화를 찍으려고 한다. 이 영화는 외계 지형이 필요하다. 실제로 우주선을 타고 외계 행성에 가서 촬영을 할 수 없기 때문에, 컴퓨터 그래픽으로 CG처리를 하려고 한다.</p>

<p>외계 지형은 중앙 이동 알고리즘을 이용해서 만들려고 한다.</p>

<p>알고리즘을 시작하면서 상근이는 정사각형을 이루는 점 4개를 고른다. 그 후에는 다음과 같은 과정을 거쳐서 지형을 만든다.</p>

<ol>
	<li>정사각형의 각 변의 중앙에 점을 하나 추가한다.</li>
	<li>정사각형의 중심에 점을 하나 추가한다.</li>
</ol>

<p>초기 상태에서 위와 같은 과정을 한 번 거치면 총 4개의 정사각형이 새로 생긴다. 이와 같은 과정을 상근이가 만족할 때 까지 계속한다.</p>

<p>아래 그림은 과정을 총 2번 거쳤을 때까지의 모습이다.</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="https://upload.acmicpc.net/5e446f0f-613c-4ce0-a626-6b0c2729ed1e/-/preview/" style="width: 214px; height: 213px;"></td>
			<td><img alt="" src="https://upload.acmicpc.net/65c1bcf1-7d8a-463b-91df-d6cabcc2ceae/-/preview/" style="width: 212px; height: 213px;"></td>
			<td><img alt="" src="https://upload.acmicpc.net/27b99467-cfdf-4ce3-a0b0-2897747edcf9/-/preview/" style="width: 212px; height: 213px;"></td>
		</tr>
		<tr>
			<td>초기 상태 - 점 4개</td>
			<td>1번 - 점 9개</td>
			<td>2번 - 25개</td>
		</tr>
	</tbody>
</table>

<p>상근이는 어떤 점은 한 개 보다 많은 정사각형에 포함될 수 있다는 사실을 알았다. 메모리 소모량을 줄이기 위해서 중복하는 점을 한 번만 저장하려고 한다. 과정을 N번 거친 후 점 몇 개를 저장해야 하는지 구하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 N이 주어진다. (1 ≤ N ≤ 15)</p>

### 출력 

 <p>첫째 줄에 과정을 N번 거친 후 점의 수를 출력한다.</p>

