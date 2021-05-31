def solution(progresses, speeds):
    answer = []
    
    times = 0
    cnt = 0
    
    while progresses:
        if progresses[0] + times*speeds[0] >= 100:
            progresses.pop(0)
            speeds.pop(0)
            cnt += 1
        else:
            times += 1
            if cnt > 0:
                answer.append(cnt)
                cnt = 0
                
    answer.append(cnt) # progresses 마지막 요소 pop 하고 마지막 count 넣어주기!
    return answer

