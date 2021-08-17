from collections import  deque

dx = [-1, 1, 0, 0]
dy = [0, 0, 1, -1]

def bfs(place, person):
    visited = [[False] * 5 for _ in range(5)]
    count = 0
    q = deque()
    q.append(person)
    while q:
        for _ in range(len(q)):
            y, x = q.popleft()
            visited[y][x] = True
            for i in range(4):
                nx = x + dx[i]
                ny = y + dy[i]
                if nx < 0 or ny < 0 or nx >= 5 or ny >= 5 or visited[ny][nx]:
                    continue
                if place[ny][nx] == 'P':
                    return False
                elif place[ny][nx] == 'X':
                    continue
                else:
                    q.append((ny, nx))

        count += 1
        if count == 2 or not q:
            return True

def solution(places):
    #print(places)
    answer = []
    for place in places:
        people = deque()
        for i in range(5):
            for j in range(5):
                if place[i][j] == 'P':
                    people.append((i,j)) # 'P'의 행열 people에 append
        if len(people) == 0:
            answer.append(1)
            continue

        flag = True
        for person in people:
            if not bfs(place, person):
                flag = False
                break
        if not flag:
            answer.append(0)
        else:
            answer.append(1)

    return answer


print(solution(places=[["POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"],
                        ["POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"],
                        ["PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"],
                        ["OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"],
                        ["PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"]]))