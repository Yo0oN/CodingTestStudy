# 첫번째 풀이
# import itertools
# def solution(nums):
#     combi = list(itertools.combinations(nums, 3))
#     answer = 0
#     for i in combi:
#         hap = sum(i)
#         for div in range(2, sum(i)):
#             if hap % div == 0:
#                 isPrime = False
#                 break;
#             else:
#                 isPrime = True
#         if isPrime:
#             answer += 1
#     return answer

from itertools import combinations
def solution(nums):
    answer = 0
    for combi in combinations(nums, 3):
        hap = sum(combi)
        for div in range(2, hap):
            if hap % div == 0:
                break
        else:
            answer += 1
    return answer

