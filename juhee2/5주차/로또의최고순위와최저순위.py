# 첫번째 풀이
# def solution(lottos, win_nums):
#     answer = []
    
#     cnt = 0
#     for l in lottos:
#         if l in win_nums:
#             cnt += 1
            
#     wildCard = lottos.count(0)
    
#     answer.extend([checkRank(cnt + wildCard), checkRank(cnt)])
#     return answer


# def checkRank(cnt):
#     rank = 0
    
#     if cnt == 6:
#         rank = 1
#     elif cnt == 5:
#         rank = 2
#     elif cnt == 4:
#         rank = 3
#     elif cnt == 3:
#         rank = 4
#     elif cnt == 2:
#         rank = 5
#     else:
#         rank = 6
#     return rank

# 두번째 풀이
def solution(lottos, win_nums):
    answer = []
    
    ranks = [6,6,5,4,3,2,1]
    
    cnt = 0
    for l in lottos:
        if l in win_nums:
            cnt += 1
            
    wildCard = lottos.count(0)
    
    return [ranks[cnt + wildCard], ranks[cnt]]
