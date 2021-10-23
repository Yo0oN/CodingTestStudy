def solution(brown, yellow):

    totalCarpet = brown + yellow

    for i in range(totalCarpet, 2, -1):
        if totalCarpet % i == 0:
            a = totalCarpet // i

            if yellow == (i-2)*(a-2):
                return [i, a]