# [Bronze IV] 녹색거탑 - 24723 

[문제 링크](https://www.acmicpc.net/problem/24723) 

### 성능 요약

메모리: 11576 KB, 시간: 76 ms

### 분류

사칙연산, 수학

### 문제 설명

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/d90f56a3-1cd2-4389-a352-3049748c8dad/-/preview/" style="height: 71px; width: 300px;"></p>

<blockquote>
<p>Naver D2를 아시나요? D2는 For Developers, By Developers의 약자로, 개발자들을 위해 개발자들이 직접 만들어 가고 있는 네이버 개발자 지원 프로그램입니다. 네이버가 축적한 기술과 지식을 공유하고, 외부 개발자들을 지원해 대한민국 개발자 역량 강화를 이끌고, 이를 통해 업계 전체와 네이버가 함께 성장하는 선순환 구조를 만들고자 합니다.</p>

<p>사실 네이버의 개발자 지원은 오랜 기간 꾸준히 이어져 왔습니다. 개발자 컨퍼런스 DEVIEW를 비롯, 오픈 소스와 개발 도구 공개, 학회 및 커뮤니티 지원 등 여러 지원 프로그램이 있었습니다. 이런 다양한 프로그램을 하나로 통합한 것이 바로 Naver D2입니다.</p>
</blockquote>

<p>2022년 봄 어느 날.</p>

<p>전 세계에 <strong>코<span style="color:#e74c3c;">딩괴물</span></strong>이 나타났다.</p>

<p>그리고 코딩괴물과 함께 갑작스레 등장한 '<span style="color:#2ecc71;"><strong>그것</strong></span>'...</p>

<p>바로 <strong><span style="color:#2ecc71;">녹색거탑</span></strong>이다.</p>

<p>녹색거탑의 정상에서는 매년 <strong>NAVER</strong>가 개최하는 개발자 컨퍼런스<strong> DEVIEW</strong>가 열린다. 이 DEVIEW에 참여하면, 코딩에 깊은 깨달음을 얻어 코딩괴물이 될 수 있다고 전해진다. 그리고 코딩괴물은 녹색거탑의 정상에서 내려온다. 예전부터 전해 내려오는 <strong>D2</strong> 비전서에 의하면, 코딩괴물이 녹색거탑의 정상에서 내려오는 경우의 수를 파악한 사람은, 개발자 컨퍼런스<strong> </strong>DEVIEW에 참여할 수 있다 한다. 그리고 DEVIEW에 참여해 본인도 코딩괴물이 될 수 있다!</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/db58c1ff-9dcd-4f53-8401-b66d74adcc66/-/preview/" style="width: 600px; height: 457px;"></p>

<p>녹색거탑은 위 그림과 같이 규칙적으로 쌓여있다.</p>

<ul>
	<li>그림의 시야에 보이지 않는 블록은 없다.</li>
	<li>그림의 시야에 보이는 블록의 윗면만 이용해 녹색거탑을 내려올 수 있다.</li>
	<li>녹색거탑이 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container>층이면, 총 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container>개의 블록을 이용한 최단 경로로만 내려온다.</li>
	<li>녹색거탑을 내려올 때는 정상에서 시작해 노란색 바닥까지, 항상 인접한 아래층의 블록으로만 내려온다.</li>
</ul>

<p><span style="color:#2ecc71;"><strong>녹색거탑</strong></span>을 정복하고 <strong>DEVIEW</strong>에 참여하자.</p>

### 입력 

 <p>녹색거탑의 높이를 나타내는 정수 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container>이 주어진다. (<mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c35"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mo>≤</mo><mi>N</mi><mo>≤</mo><mn>5</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1 \leq N \leq 5$</span></mjx-container>)</p>

### 출력 

 <p>녹색거탑의 정상에서 바닥으로 내려오는 경우의 수를 출력한다.</p>

