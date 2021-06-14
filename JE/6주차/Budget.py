def solution(d, budget):
    answer = 0
    check = 0

    d.sort()

    if sum(d) <= budget:
        return answer + len(d)

    else:
        for i in d:
            check += i
            if check <= budget:
                answer += 1
            else:
                break

    return answer