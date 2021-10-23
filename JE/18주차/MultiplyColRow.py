def solution(arr1, arr2):
    # answer의 배열크기 0으로 초기화
    answer = [[0 for _ in range(len(arr2[0]))] for _ in range(len(arr1))]

    for i in range(len(arr1)):   # arr1 배열 크기만큼
        for j in range(len(arr2[0])): # arr2 2차원 배열 내 1번째 배열
            for k in range(len(arr1[0])):  # arr1 배열 내 1번째 배열
                answer[i][j] += (arr1[i][k] * arr2[k][j])

    return answer