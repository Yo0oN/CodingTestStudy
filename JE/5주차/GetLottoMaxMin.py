def solution(lottos, win_nums):
    answer = []
    count = [0, 0]

    for lotto in lottos:
        if lotto in win_nums:
            count[0] += 1
            count[1] += 1

        elif lotto == 0:
            count[0] += 1

    max = count[0]
    min = count[1]

    if max == 6:
        answer.append(1)

    elif max == 5:
        answer.append(2)

    elif max == 4:
        answer.append(3)

    elif max == 3:
        answer.append(4)

    elif max == 2:
        answer.append(5)

    else:
        answer.append(6)

    if min == 6:
        answer.append(1)

    elif min == 5:
        answer.append(2)

    elif min == 4:
        answer.append(3)

    elif min == 3:
        answer.append(4)

    elif min == 2:
        answer.append(5)

    else:
        answer.append(6)

    return answer