def solution(strings, n):
    answer = []
    strings.sort()
    
    ordered = sorted([[i , strings[i][n]] for i in range(len(strings))], key = lambda x: x[1])
    
    answer = [strings[ordered[i][0]] for i in range(len(ordered))]
    return answer
