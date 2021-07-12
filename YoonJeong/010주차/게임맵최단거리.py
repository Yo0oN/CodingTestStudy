def solution(maps):
    # 오른쪽, 아래, 왼쪽, 위
    moves = [(0, 1), (1, 0), (0, -1), (-1, 0)]
    # 방문한 곳
    visited = []
    visited.append((len(maps) - 1, len(maps[0]) - 1, 1))
    
    # 방문한곳이 존재하면 계속 진행
    while visited :
        y, x, cnt = visited.pop(0) # 현재 위치
        maps[y][x] = 0 # 이미 지나온 곳은 다시 지나가지 못하게 0으로 만든다.
        
        for dy, dx in moves:
            ny, nx = y + dy, x + dx # ny, nx에는 다음 위치의 좌표가 들어감
            
            # 다음 위치가 목적지면, 지금까지의 count + 1을 반환
            if ny == 0 and nx == 0 :
                return cnt + 1
            
            # 목적지가 아니고, 이동할 곳이 실제로 존재하는 곳이면 진행
            elif 0 <= ny < len(maps) and 0 <= nx < len(maps[0]) and maps[ny][nx] == 1 :
                maps[ny][nx] = 0
                visited.append((ny, nx, cnt + 1))
            
    return -1
