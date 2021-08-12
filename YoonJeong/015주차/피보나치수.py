def solution(n):
    fivo = [0, 1, 1]

    for i in range(3, n + 1) :
        fivo.append(fivo[i - 1] + fivo[i - 2])

    return fivo[n] % 1234567
