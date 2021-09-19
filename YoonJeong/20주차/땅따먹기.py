def solution(land):
    for i in range(len(land) - 1) :
        for j in range(4) :
            land[i + 1][j] += max(land[i][0:j] + land[i][j + 1:])
    return max(land[-1])

#     now = [] # 점수, 현재 위치가 들어감

#     for i in range(4) :
#         now.append([land[0][i], 0, i])
#     while now :
#         point, x, y = now.pop(0)
#         # 마지막에 도착했다면 중단
#         if x == len(land) - 1 :
#             if answer < point : # 마지막 값이 answer 보다 크다면 값 담기
#                 answer = point
#             continue
        
#         # 마지막이 아니라면 계속 진행
#         for i in range(4) :
#             if i == y : # 같은열은 밟을수없음
#                 continue
#             now.append([point + land[x + 1][i], x + 1, i])
