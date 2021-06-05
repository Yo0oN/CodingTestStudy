scoville = [1, 2, 3, 9, 10, 12]
K = 7
cnt = 0
#효율성 테스트 실패
# sort를 써서 시간 초과가 된듯하다
"""while scoville[0] < K :
    cnt += 1
    newScowille = scoville[0]+(scoville[1]*2)
    print(scoville)
    print(newScowille)
    del scoville[1]
    del scoville[0]
    #print(scoville)
    scoville.insert(0, newScowille)
    scoville = sorted(scoville)
print(cnt)
"""

#heapq 모듈을 사용하여 풀이
#제출용

import heapq
def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville) #list 힙으로 변환
    while scoville[0] < K :
        if len(scoville) == 1 and scoville[0] < K:
            return -1
        newScoville = heapq.heappop(scoville)+(heapq.heappop(scoville)*2)
        heapq.heappush(scoville,newScoville)
        answer += 1
    return answer