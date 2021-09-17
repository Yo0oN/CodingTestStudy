def solution(n):
    answer = 1
    for i in range(1, n//2+1):
        total = 0
        for j in range(i, (n//2)+2):
            total += j
            if total == n:
                answer+=1
                break
            elif total > n:
                break
    return answer
