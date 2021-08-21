def solution(strings, n):
    answer = []

    answer = sorted(sorted(strings), key=lambda x:x[n])

    return answer