def solution(progresses, speeds):
    answer = []
    flag = 0
    
    while progresses :
        q, r = divmod((100 - progresses[0]), speeds[0])
        
        if progresses[0] >= 100 :
            flag += 1
            progresses.pop(0)
            speeds.pop(0)
            continue
        elif r == 0:
            progresses = [i + (j * q) for i, j in zip(progresses, speeds)]
        else :
            progresses = [i + (j * (q + 1)) for i, j in zip(progresses, speeds)]
            
        if flag != 0 :
            answer.append(flag)
            flag = 0
            
    answer.append(flag)
    
    return answer
