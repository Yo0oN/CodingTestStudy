def solution(n, arr1, arr2):
    answer = []

    for i in range(n):
        # 2진수로 변환하는 방법, str로 처리됨
        arr1[i] = format(arr1[i], 'b')
        arr2[i] = format(arr2[i], 'b')

        # 변환된 2진수가 n의 길이보다 짧을경우에는 0으로 채워준다
        arr1[i] = ('0' * (n - len(arr1[i]))) + arr1[i]
        arr2[i] = ('0' * (n - len(arr2[i]))) + arr2[i]

        pattern = ""

        for j in range(n):  # 이렇게 해줘야 str내 숫자를 1개씩 가져옴 ex) arr1[0]: 01001 / arr1[0][0]: 01001 중 0을 가져옴
            if arr1[i][j] == '1' or arr2[i][j] == '1':
                pattern += '#'

            else:
                pattern += ' '

        answer.append(pattern)
    return answer