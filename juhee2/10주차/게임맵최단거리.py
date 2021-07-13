from collections import deque
def solution(maps):
    answer = 0
    n,m = len(maps), len(maps[0]) # 가로, 세로
    # visited = [[-1 for _ in range(n)] for _ in range(m)] # 방문 여부 저장
    # 상하좌우
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    
    q = deque()
    q.append((0,0)) # 캐릭터 초기 위치
    # visited[0][0] = 1 # 초기 방문
    
    while q:
        x,y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= m: continue # 인덱스가 범위 넘어가는 경우
            if maps[nx][ny] == 0: continue # 벽인 경우
            
            if maps[nx][ny] == 1:
                q.append((nx, ny))
                maps[nx][ny] = maps[x][y] + 1
                
    answer = maps[-1][-1] if maps[-1][-1] > 1 else -1
    return answer
            # if 0 <= nx < n and 0 <= ny < m:                
                # if maps[nx][ny] == 1 and visited[nx][ny] == -1:
                    # visited[nx][ny] = visited[x][y] + 1 
                    # q.append((nx,ny))
    # return visited[-1][-1]
