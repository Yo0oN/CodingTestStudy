# 첫 번째 풀이
# def solution(left, right):
#     answer = 0
#     for num in range(left, right + 1) :
#         cnt = 0
#         for i in range(1, num+1):
#             if num % i == 0:
#                 cnt += 1
#         answer += num if cnt % 2 == 0 else -num
    
#     return answer

# 두번째 풀이
# 제곱근을 제외한 나머지 수들은 약수가 짝수개!!!
def solution(left, right):
    answer = 0
    for num in range(left, right + 1) :
        if int(num ** 0.5) == num ** 0.5:
            answer -= num
        else:
            answer += num
    return answer
