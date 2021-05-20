from itertools import combinations
from math import sqrt

def solution(nums):
    answer = 0
    # itertools.combinations(n, r) : 서로 다른 n에서 중 r개를 추출(순서 없음)
    # math.sqrt(x) : x의 제곱근을 구해줌 (해당 함수를 모를 경우 n ** 0.5 로 계산 가능)
    # 소수? 1과 자기자신 외에 어떤 숫자로도 나누어 떨어지지 않는 수
    # 소수 구하는 법 : 1. 1~n까지의 수로 나눠본다.
    #                2. n의 제곱근까지의 수로 나눠본다.
    #                   -> 50의 약수는 1, 2, 5, 10, 25, 50으로, 약수의 중심인 5까지만 나눠봐도 된다.
    #                      약수의 절반은 n의 제곱근 이하에 존재한다.
    #                3. n의 제곱근 이하의 소수로 나눠본다.
    #                   -> 모든 자연수는 소수들의 곱으로 표현 가능하다.(대표적인 소수 : 2, 3)
    #                      만약 n의 제곱근 이하의 소수로 나눴는데 나누어진다면 그것은 소수가 아니다.
    # 위의 방식 중 1번은 O(n), 3번은 n 이하의 모든 소수를 알아야하기 때문에 2번으로 진행
    for combination in combinations(nums, 3) :
        combiSum = sum(combination)
        flag = True
        
        for i in range(2, int(sqrt(combiSum)) + 1) :
            if combiSum % i == 0 :
                flag = False
                break
        
        if flag :
            answer += 1

    return answer
