import heapq

def solution(scoville, K):
    answer = 0

    heapq.heapify(scoville)

    while len(scoville) >= 2 and scoville[0] < K:
        scovilleRate = heapq.heappop(scoville) + (heapq.heappop(scoville) * 2)
        heapq.heappush(scoville, scovilleRate)
        answer += 1

    if scoville[0] >= K:
        return answer
    else:
        return -1