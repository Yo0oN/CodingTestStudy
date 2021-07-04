from itertools import permutations
import math
# permutations를 이용해서 모든 경우의 수를 만들고 판정 -> 순열

def solution(numbers):
    answer = set()
    for n in range(len(numbers)):
        for i in set(list(permutations(numbers, n + 1))):
            if in_decimal(int(''.join(i))):
                answer.add(int(''.join(i)))
    return len(answer)

def in_decimal(n):
    if n < 2:
        return False
    for i in range(2, n):
        if n % i == 0 and n != 0:
            return False
        else:
            return True
print(solution("17"))