def solution(N, stages):
    answer = []
    length = len(stages)
    result = {}

    for stage in range(1, N + 1):
        if length != 0:
            fail = stages.count(stage)
            result[stage] = fail / length
            length -= fail
        else:
            result[stage] = 0

    answer = sorted(result, key = lambda x: result[x], reverse = True)
    
    return answer