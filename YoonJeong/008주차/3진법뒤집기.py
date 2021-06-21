def solution(n):
    threeL = []
    
    while n > 0 :
        qr = divmod(n, 3)
        n = qr[0]
        threeL.insert(0, qr[1])

    return sum([threeL[i] * (3 ** i) for i in range(len(threeL))])
