def solution(arr1, arr2):
    answer = [[0] * len(arr2[0]) for i in range(len(arr1))]
    for i in range(len(arr1)):
        for j in range(len(arr2[0])):
            result = 0
            for k in range(len(arr2)):
                result += arr1[i][k] * arr2[k][j]
            answer[i][j] = result
    return answer
