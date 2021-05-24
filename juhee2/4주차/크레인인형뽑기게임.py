# 첫번째 풀이
# def solution(board, moves):
#     pick = []
#     answer = 0
    
#     for move in moves:
#         for i in range(len(board)):
#             if (board[i][move-1] == 0):
#                 continue
#             else:
#                 if not pick:
#                     pick.append(board[i][move-1])
#                 else:
#                     if pick[-1] == board[i][move-1]:
#                         pick.pop()
#                         answer += 2
#                     else:
#                         pick.append(board[i][move-1])
#                 board[i][move-1] = 0
#                 break
    
#     return answer

def solution(board, moves):
    pick = []
    answer = 0
    
    for move in moves:
        for i in range(len(board)):
            if (board[i][move-1] == 0):
                continue
                
            if not pick:
                pick.append(board[i][move-1])
            else:
                if pick[-1] == board[i][move-1]:
                    pick.pop()
                    answer += 2
                else:
                    pick.append(board[i][move-1])
            board[i][move-1] = 0
            break
    
    return answer
