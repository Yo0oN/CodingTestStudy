def solution(n):
    answer = ''
    result = 0
    while n>= 1:
        rest = n%3
        n //= 3
        answer += str(rest)
    i=0
    for cn in range(len(answer)-1,-1,-1):
        result += int(answer[cn])*(3**i)
        i+= 1
    return result