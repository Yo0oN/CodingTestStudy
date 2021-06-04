def solution(board, moves):
    answer = []
    bucket = []

    for move in moves:
        for j in range(len(board)):
            if board[j][move-1] != 0:
                bucket.append(board[j][move-1])
                board[j][move-1] = 0  # 뽑은 인형자리는 다시 찾지않도록 0으로 설정

                if bucket[-1:] == bucket[-2:-1]:  # 제일 마지막으로 들어온 값과 그 이전값이 같다면 answer에 넣어줌
                    answer += bucket[-1:]
                    bucket = bucket[:-2]
                break

    return len(answer) * 2