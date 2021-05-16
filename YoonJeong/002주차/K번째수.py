def solution(array, commands):
    answer = []
    
    for command in commands :
        i, j, k = command
        cutArray = sorted(array[i - 1 : j])
        answer.append(cutArray[k - 1])
        
    return answer
