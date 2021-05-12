# 첫번째 풀이
# def solution(array, commands):
#     answer = []
#     for i in range(len(commands)) :
#         result = sorted(array[commands[i][0] - 1 : commands[i][1]])
#         answer.append(result[commands[i][-1] - 1])
#     return answer

# 두번째 풀이
# def solution(array, commands):
#     answer = []
#     for i in range(len(commands)) :
#         answer.append(sorted(array[commands[i][0] - 1 : commands[i][1]])[commands[i][-1] - 1])
#     return answer

# 세번째 풀이
def solution(array, commands):
    return list(map(lambda com : sorted(array[com[0]-1:com[1]])[com[2]-1], commands))
