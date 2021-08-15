ROOM_SIZE = 5

def checkIdxRange(x, y):
    if 0 <= x < ROOM_SIZE and 0 <= y < ROOM_SIZE:
        return True
    else:
        return False

def solution(places):
    answer = []
    
    for room in places:
        flag = 1
        for i in range(ROOM_SIZE):
            for j in range(ROOM_SIZE):
                if room[i][j] == 'P': # 응시자가 있으면
                    # 오른쪽에 사람이 앉은경우
                    if checkIdxRange(i, j+1) and room[i][j+1] == 'P':
                        flag = 0
                    # 오른쪽 맨해튼 거리 안에 있으면서 파티션이 없는 경우
                    if checkIdxRange(i, j+2) and room[i][j+2] == 'P' and room[i][j+1] != 'X':
                        flag = 0
                    # 아래쪽
                    if checkIdxRange(i+1, j) and room[i+1][j] == 'P':
                        flag = 0
                    # 아래쪽 맨해튼 거리 안에 있으면서 파티션이 없는 경우
                    if checkIdxRange(i+2, j) and room[i+2][j] == 'P' and room[i+1][j] != 'X':
                        flag = 0
                    # 아래쪽 왼쪽 대각선이 P 이면서, 왼쪽-아래쪽에 파티션이 없는 경우
                    if checkIdxRange(i+1, j-1) and room[i+1][j-1] == 'P' and (room[i+1][j] != 'X' or room[i][j-1] != 'X'):
                        flag = 0
                    # 아래쪽 오른쪽 대각선이 P이면서, 오른쪽- 아래쪽에 파티션이 없는 경우
                    if checkIdxRange(i+1, j+1) and room[i+1][j+1] == 'P' and (room[i+1][j] != 'X' or room[i][j+1] != 'X'):
                        flag = 0
        answer.append(flag)
    return answer
