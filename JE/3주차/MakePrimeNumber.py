import itertools

def solution(nums):
    answer = 0
    numsList = list(itertools.combinations(nums, 3))

    for i in numsList:
        check = sum(i)
        result = isPrime(check)

        if result == True:
            answer += 1

    return answer

def isPrime(sumOfNums):

    for i in range(2, sumOfNums):
        if sumOfNums % i == 0:
            break
    else:
        return True