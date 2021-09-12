def solution(arr1, arr2):
    answer = []
    
    for arr1I in range(len(arr1)):
        arr3 = []
        for arr2I in range(len(arr2[0])):
            a3 = 0
            for i in range(len(arr1[arr1I])):
                a3 += arr1[arr1I][i] * arr2[i][arr2I]
            arr3.append(a3)
        answer.append(arr3)
    return answer
