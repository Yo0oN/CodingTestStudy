# [Silver IV] 인사성 밝은 곰곰이 - 25192 

[문제 링크](https://www.acmicpc.net/problem/25192) 

### 성능 요약

메모리: 24248 KB, 시간: 236 ms

### 분류

자료 구조, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p style="text-align: center;"><img alt="인사하는 곰곰이" src="https://upload.acmicpc.net/cd52b787-5b7c-4857-b917-a95c10fe6ee9/-/preview/" style="max-height:120px; object-fit:contain; display:inline-block;"></p>

<p>알고리즘 입문방 오픈 채팅방에서는 새로운 분들이 입장을 할 때마다 곰곰티콘을 사용해 인사를 한다. 이를 본 문자열 킬러 임스는 채팅방의 기록을 수집해 그 중 곰곰티콘이 사용된 횟수를 구해 보기로 했다.</p>

<p><code>ENTER</code>는 새로운 사람이 채팅방에 입장했음을 나타낸다. 그 외는 채팅을 입력한 유저의 닉네임을 나타낸다. 닉네임은 숫자 또는 영문 대소문자로 구성되어 있다.</p>

<p>새로운 사람이 입장한 이후 처음 채팅을 입력하는 사람은 반드시 곰곰티콘으로 인사를 한다. 그 외의 기록은 곰곰티콘을 쓰지 않은 평범한 채팅 기록이다.</p>

<p>채팅 기록 중 곰곰티콘이 사용된 횟수를 구해보자!</p>

### 입력 

 <p>첫 번째 줄에는 채팅방의 기록 수를 나타내는 정수 <mjx-container class="MathJax" jax="CHTML" style="font-size: 107.1%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container> 이 주어진다. (<mjx-container class="MathJax" jax="CHTML" style="font-size: 107.1%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mstyle><mjx-mspace style="width: 0.167em;"></mjx-mspace></mjx-mstyle><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mo>≤</mo><mi>N</mi><mo>≤</mo><mn>100</mn><mstyle scriptlevel="0"><mspace width="0.167em"></mspace></mstyle><mn>000</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1 \le N \le 100\,000$</span></mjx-container>)</p>

<p>두 번째 줄부터 <mjx-container class="MathJax" jax="CHTML" style="font-size: 107.1%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container> 개의 줄에 걸쳐 새로운 사람의 입장을 나타내는 <code>ENTER</code>, 혹은 채팅을 입력한 유저의 닉네임이 문자열로 주어진다. (<mjx-container class="MathJax" jax="CHTML" style="font-size: 107.1%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mtext class="mjx-ty" space="4"><mjx-utext variant="monospace" style="font-size: 84%; padding: 0.893em 0px 0.238em; font-family: MJXZERO, monospace;">문</mjx-utext><mjx-utext variant="monospace" style="font-size: 84%; padding: 0.893em 0px 0.238em; font-family: MJXZERO, monospace;">자</mjx-utext><mjx-utext variant="monospace" style="font-size: 84%; padding: 0.893em 0px 0.238em; font-family: MJXZERO, monospace;">열</mjx-utext><mjx-c class="mjx-c20 TEX-T"></mjx-c><mjx-utext variant="monospace" style="font-size: 84%; padding: 0.893em 0px 0.238em; font-family: MJXZERO, monospace;">길</mjx-utext><mjx-utext variant="monospace" style="font-size: 84%; padding: 0.893em 0px 0.238em; font-family: MJXZERO, monospace;">이</mjx-utext></mjx-mtext><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c32"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mo>≤</mo><mtext mathvariant="monospace">문자열 길이</mtext><mo>≤</mo><mn>20</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1 \le \texttt{문자열 길이} \le 20$</span></mjx-container>)</p>

<p>첫 번째 주어지는 문자열은 무조건 <code>ENTER</code>이다.</p>

### 출력 

 <p>채팅 기록 중 곰곰티콘이 사용된 횟수를 출력하시오.</p>

