def solution(d, budget):
    answer = 0
    d.sort()
    for dd in d :
        if budget - dd < 0:
            break;
        answer += 1
        budget -= dd
    return answer

