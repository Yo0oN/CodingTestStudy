def solution(brown, yellow):
    answer = []
    
    mulB = brown + yellow # brown의 가로 * 세로
    sumB = (brown + 4) // 2 # brown의 가로 + 세로

    for i in range(sumB) :
        if i * (sumB - i) == mulB :
            answer.append(i)
            break
    answer.insert(0, sumB - answer[0])

    return answer
