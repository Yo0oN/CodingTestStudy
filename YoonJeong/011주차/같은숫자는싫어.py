def solution(arr):
    answer = []
    for a in arr :
        if answer and answer[-1] == a :
            continue
        else :
            answer.append(a)
    
    return answer
