def solution(N, stages):
    stagePP = [stages.count(i) for i in range(1, N + 2)]
    people = len(stages)
    
    stageF = []
    
    for n in range(N) :
        if people <= 0 :
            stageF.append([n, 0])
            continue
    
        stageF.append([n, stagePP[n] / people])
        people -= stagePP[n]
    
    stageF.sort(reverse = True, key = lambda item : item[1])
    
    return [i[0] + 1 for i in stageF]
