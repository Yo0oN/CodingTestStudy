def solution(left, right):
    answer = 0
    check = []
    numbers = [i for i in range(left, right + 1)]

    for i in numbers:
        for n in range(1, i + 1):
            if i % n == 0:
                check.append(n)

        if len(check) % 2 == 0:
            answer += i
            check.clear()
        else:
            answer -= i
            check.clear()

    return answer