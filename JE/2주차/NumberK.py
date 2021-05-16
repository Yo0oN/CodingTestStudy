def solution(array, commands):
    answer = []

    for i in range(len(commands)):
        cut = array[commands[i][0]-1 : commands[i][1]]
        cut.sort()
        answer.append(cut[commands[i][2] - 1])

    return answer