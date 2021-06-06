import heapq

def solution(scoville, K):
    spicy = 0
    answer = 0
    
    heapq.heapify(scoville)
    
    while len(scoville) > 1 and scoville[0] < K:
        spicy = heapq.heappop(scoville) + (heapq.heappop(scoville) * 2)
        heapq.heappush(scoville, spicy)
        answer += 1
    
    return answer if scoville[0] > K else -1
