from itertools import permutations as P
import math

def solution(numbers):
    answer = 0
    nums = list(numbers)
    pick_nums = set()
    
    for i in range(1,len(nums)+1):
        per_nums = list(P(nums, i))
        for j in per_nums:
            # n = int(''.join(j))
            # if n < 2:
            #    continue
            pick_nums.add(int(''.join(j)))
    return len(list(filter(isPrime, pick_nums)))

def isPrime(num):
    if num < 2:
        return False
    for i in range(2,int(math.sqrt(num))+1):
        if num % i == 0:
            return False
    return True
