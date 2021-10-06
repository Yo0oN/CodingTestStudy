import heapq
def solution(jobs):
    answer ,now, cnt = 0,0,0
    start = -1 # 바로 이전 작업 시작시간
    heap = []

    while cnt < len(jobs):
        for job in jobs:
            if start < job[0] <= now: # 현재시점에 작업을 처리할수 있는지
                heapq.heappush(heap, [job[1], job[0]]) # 작업 소요 시간 기준으로 최소 힙 [작업시간, 도착시간]
        if len(heap) > 0:
            current = heapq.heappop(heap) # 제일 앞 요소 pop
            start = now
            now += current[0]
            answer += (now - current[1]) # 현재 시점 - 작업 요청 시간 (해당 작업에 총 걸린 시간)
            cnt += 1 # 완료한 작업 수 +1
        else:
            now += 1 # 현재 처리할게 없는 경우, 작업 요청시간 아직 오지 않은것이므로 (현재 시점 + 1)
    return int(answer / len(jobs))
