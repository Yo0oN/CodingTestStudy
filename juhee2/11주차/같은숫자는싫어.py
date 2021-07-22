# 효율성 0점
# def solution(arr):
#     remove = [i for i in range(len(arr) - 1) if arr[i] == arr[i+1]]
#     return [arr[i] for i in range(len(arr)) if i not in remove]

def solution(arr):
    answer = []
    for i,a in enumerate(arr):
        if i == 0:
            answer.append(a)
            continue
        if answer[-1] != a:
            answer.append(a)
    return answer
