from itertools import permutations

def solution(numbers):
    answer = 0

    numList = [i for i in numbers]
    nums = []

    # 모든 경우의 수를 구하기(앞자리 0인 것은 제외됨)
    for i in range(1, len(numbers) + 1):
        for j in list(permutations(numList, i)):

            if ''.join(j).startswith('0'):
                continue
            else:
                nums.append(''.join(j))

    # 중복이 나올 수 있기 때문에 중복 제거 후 리스트로 변환
    nums = list(set(nums))

    # 소수 판별하기, isPrime()으로 True가 나오는 숫자가 있을 경우 카운트
    for i in nums:
        result = isPrime(int(i))

        if result == True:
            answer += 1

    return answer

def isPrime(n):
    if(n < 2):
        return False

    for i in range(2, n):
        if(n % i==0):
            return False

    return True