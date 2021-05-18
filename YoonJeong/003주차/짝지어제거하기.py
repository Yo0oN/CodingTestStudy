def solution(s):
    answer = 0
    sStack = []
    
    for i in s :
        if len(sStack) == 0 :
            sStack.append(i)
            
        elif sStack[-1] == i :
            sStack.pop()
        
        else :
            sStack.append(i)
            
    if len(sStack) == 0 :
        answer = 1
        
    return answer
