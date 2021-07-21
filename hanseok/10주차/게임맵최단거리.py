from collections import deque
#BFS알고리즘
maps = [[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,1],[0,0,0,0,1]]
d = [[1,0], [-1, 0], [0,1], [0,-1]] #위,아래,왼쪽, 오른쪽 움직일때 사용할 좌표 리스트

r = len(maps)
c = len(maps[0])
table = [[-1 for _ in range(c)] for _ in range(r)] #map만들기
q = deque()
q.append([0, 0]) #시작좌표
table[0][0] = 1 #시작지점 한칸 이므로 1넣어줌

while q:
    y,x = q.popleft()

    for i in range(4):
        ny = y + d[i][0]
        nx = x + d[i][1]
        # 맵안에 있고 벽이 아닌 경우
        if -1 < ny < r and -1 < nx < c:
            if maps[ny][nx] == 1:
                if table[ny][nx] == -1:
                    table[ny][nx] = table[y][x] + 1
                    q.append([ny, nx])

    answer = table[-1][-1]
print(answer)

