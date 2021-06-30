def solution(n, arr1, arr2):
    answer = []
    
    for a1, a2 in zip(arr1, arr2) :
        arrString = ''
        for i in range(n) :
            if (a1 % 2) + (a2 % 2) > 0 :
                arrString = '#' + arrString
            else :
                arrString = ' ' + arrString
            a1, a2 = a1 // 2, a2 // 2
        answer.append(arrString)
        
    return answer
