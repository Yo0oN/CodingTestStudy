def solution(participant, completion):
    p = sorted(participant)
    c = sorted(completion)

    num = len(c)

    for i in range(num):
        if p[i] != c[i]:
            return p[i]
    return p[i + 1]