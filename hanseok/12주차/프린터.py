#priorities = [2, 1, 3, 2] #프린터 될 문서수와 중요도
#location   = 2 #내가 프린트 해야할 문서 -> list상에서는 3번째 문서
#return 1 # 3번째 문서가 가장 처음으로 return 되어 나와서 1임

#중요도에 따라 return을 해야하고 중요도가 같은값으면 왼쪽부터 우선순위임

from collections import deque

priorities = [1, 1, 9, 1, 1, 1]
location   = 0
answer     = 0

deq =  deque([(i,p) for i,p in enumerate(priorities)])
#[(0, 2), (1, 1), (2, 3), (3, 2)]
print(deq.popleft()) #deque맨처음값
print(max(deq)[0]) #deque의 (3, 2) -> 3

while len(deq):
    first = deq.popleft()
    if deq and first[0] < max(deq)[0]:
        deq.append(first)
    else: #max == first[0]
        answer += 1 #우선순위가 높고 프린터가 되므로 answer +=1 한다
        if first[1] == location:
            #print('deq = '+str(deq[1]))
            #print(location)
            break
print(answer)
