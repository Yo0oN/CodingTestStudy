def solution(dartResult):
    sdt = ['S', 'D', 'T']
    aL = []
    pivot = 0
    while pivot < len(dartResult) :
        if dartResult[pivot + 1] in sdt :
            aL.append(int(dartResult[pivot]) ** (sdt.index(dartResult[pivot + 1]) + 1))
            pivot += 2
        else :
            aL.append(int(dartResult[pivot : pivot + 2]) ** (sdt.index(dartResult[pivot + 2]) + 1))
            pivot += 3

        if pivot < len(dartResult) and dartResult[pivot] == '*' :
            aL = [aL[i] * 2 if (i == len(aL) - 2 or i == len(aL) - 1) else aL[i] for i in range(0, len(aL))]
            pivot += 1
        elif pivot < len(dartResult) and dartResult[pivot] == '#' :
            aL[-1] = aL[-1] * (-1)
            pivot += 1
    
    return sum(aL)
