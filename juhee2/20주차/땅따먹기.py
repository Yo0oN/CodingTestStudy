def solution(land):
    answer = 0
    
    for i in range(1, len(land)):
        for n in range(4):
            land[i][n] += max([land[i-1][idx] for idx in range(4) if idx != n])
    
    return max(land[-1])
