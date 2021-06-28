def solution(numbers, target):
    
    targetList = [0]
    
    for number in numbers :
        lenTL = len(targetList)
        
        while len(targetList) <= lenTL * 2 :
            if len(targetList) % 2 == 1 :
                targetList.append(targetList[(len(targetList) - 1) // 2] + number)
            else :
                targetList.append(targetList[(len(targetList) - 1) // 2] - number)
    
    return targetList[len(targetList)// 2 :].count(target)
