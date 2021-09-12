import heapq

def solution(jobs):
    answer = 0
    
    start = -1 # 직전 작업이 시작된 시간
    now = 0 # 현재시간
    i = 0
    
    heap = []
    
    while i < len(jobs) :
        for job in jobs :
            if start < job[0] <= now: # 지금 할수 있는 작업이 있다면 heap에 담기
                heapq.heappush(heap, [job[1], job[0]])
        
        if heap : # 처리할 작업이 있다면
            cur = heapq.heappop(heap) # 작업을 뺀 후 현재해야할 작업에 넣는다.
            start = now # start에 작업 시작시간을 넣어주고
            now += cur[0] # 현재시간을 작업이 끝난후로 변경한다.
            answer += now - cur[1] # 작업 요청시간부터 종료시간까지의 시간 계산
            i +=1
        else: # 처리할 작업이 없는 경우 다음 시간으로 넘어간다
            now += 1
                
    return answer // len(jobs)
