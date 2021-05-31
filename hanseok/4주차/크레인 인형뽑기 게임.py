#연습용
board = [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]
moves = [1,5,3,5,1,2,1,4]
result= []
cnt = 0
for i in moves:
    print("i = "+str(i))
    for j in range(len(board)):
        print(board[j])
        if board[j][i-1] != 0: #0일때 지나가기
            if not result:
                result.append(board[j][i - 1])
            else:
                if result[-1] == board[j][i-1]:
                    result.pop(-1)
                    cnt +=2 #들어온값, result마지막값 지워져서 2개
                else:
                    result.append(board[j][i - 1])
            board[j][i - 1] = 0
            print("res"+str(board[j]))
            print("result = " + str(result))
            break

print(result)
print(cnt)

#제출용
def solution(board, moves):
    result = []
    cnt = 0

    for i in moves:
        for j in range(len(board)):
            boardNum = board[j][i - 1]
            if boardNum != 0:
                if not result:
                    result.append(boardNum)
                else:
                    if result[-1] == boardNum:
                        result.pop(-1)
                        cnt += 2
                    else:
                        result.append(boardNum)
                board[j][i - 1] = 0
                break

    return cnt