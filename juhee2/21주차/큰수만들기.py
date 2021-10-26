def solution(number, k):
    pick = []
    answer = ''
    for idx, val in enumerate(number):
        while pick and k > 0 and pick[-1] < val:
            pick.pop()
            k -= 1
        pick.append(val)
        if k == 0: # 뺄거 다 뺐음
            answer = "".join(pick) + number[idx+1:]
            break
        
    if k > 0: # 아직 다 못뺌
        answer = "".join(pick[:-k])
    return answer
