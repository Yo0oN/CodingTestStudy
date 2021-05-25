def solution(board, moves):
    answer = 0
    stack = []
    
    for m in moves :
        for i in range(len(board)) :
            if board[i][m - 1] == 0 :
                continue
            elif stack and board[i][m - 1] == stack[-1] :
                stack.pop()
                board[i][m - 1] = 0
                answer += 2
                break
            else :
                stack.append(board[i][m - 1])
                board[i][m - 1] = 0
                break
    
    return answer
