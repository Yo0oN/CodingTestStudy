def solution(n,a,b):
# 시간초과
#     gameQueue = [i for i in range(1, n + 1)]
#     matchCnt = 0
#     while gameQueue :
#         par1 = gameQueue.pop(0)
#         par2 = gameQueue.pop(0)
        
#         if par1 == a and par2 == b : # a와 b가 만남
#             matchCnt += 1
#             break
#         elif par1 == a or par2 == a : # a 경기일 때 a를 위로
#             matchCnt += 1
#             gameQueue.append(a)
#         elif par1 == b or par2 == b : # b 경기일 때 b를 위로
#             gameQueue.append(b)
#         else : # 둘다 아닐때 아무나 위로
#             gameQueue.append(par1)
    matchCnt = 0
    while a != b:
        a = (a + 1) // 2
        b = (b + 1) // 2
        matchCnt += 1
    return matchCnt
