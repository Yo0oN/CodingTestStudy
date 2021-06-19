def solution(N, stages):
    answer = {}
    num = len(stages)

    for stage in range(1, N + 1):
        if num != 0:
            cnt = stages.count(stage)
            answer[stage] = cnt / num
            num -= cnt
        else:
            answer[stage] = 0
    return sorted(answer, key=lambda x: answer[x], reverse=True)