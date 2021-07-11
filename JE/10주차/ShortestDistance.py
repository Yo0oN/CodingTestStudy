from collections import deque

def solution(maps):
    dx = [1, -1, 0, 0]
    dy = [0, 0, 1, -1]
    n = len(maps)
    m = len(maps[0])

    q = deque()
    q.append((0, 0))

    while q:
        cur = q.popleft()

        for i in range(4):
            x = dx[i] + cur[0]
            y = dy[i] + cur[1]

            if 0 <= x < n and 0 <= y < m and maps[x][y] == 1:
                q.append((x, y))
                maps[x][y] = maps[cur[0]][cur[1]] + 1

    if maps[-1][-1] > 1:
        return maps[-1][-1]
    else:
        return -1
