# 첫번째 풀이 (런타임 에러)
# def solution(N, stages):
#     answer = []
#     fail_rate = {}
#     people = len(stages)
#     for i in range(1, N+1):
#         cnt = stages.count(i)
#         rate = cnt / people
#         fail_rate[i] = rate
#         people -= cnt
#     answer = [i[0] for i in sorted(fail_rate.items(), key = lambda x : x[1], reverse = True)]
#     return answer

def solution(N, stages):
    answer = []
    fail_rate = {}
    people = len(stages)
    for i in range(1, N+1):
        rate = 0;
        if people > 0:
            cnt = stages.count(i)
            rate = cnt / people
            people -= cnt
        else :
            rate = 0
        fail_rate[i] = rate
    answer = [i[0] for i in sorted(fail_rate.items(), key = lambda x : x[1], reverse = True)]
    return answer
