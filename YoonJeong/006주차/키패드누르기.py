def solution(numbers, hand):
    answer = ''

    numbers = [i if i != 0 else 11 for i in numbers]
    button = [[i, i + 1, i + 2] for i in range(1, 13, 3)]
    nowL = [3, 0]
    nowR = [3, 2]
    
    for i in numbers :
        if i % 3 == 1 :
            answer += 'L'
            nowL = [i // 3, 0]
        elif i % 3 == 0 and i != 0:
            answer += 'R'
            nowR = [i // 3 - 1, 2]
        else :
            nowM = [i // 3, 1]
            leftD = abs(nowM[0] - nowL[0]) + abs(nowM[1] - nowL[1])
            rightD = abs(nowM[0] - nowR[0]) + abs(nowM[1] - nowR[1])
            if leftD == rightD :
                if hand == 'right' :
                    answer += 'R'
                    nowR = [i // 3, 1]
                else :
                    answer += 'L'
                    nowL = [i // 3, 1]
            elif leftD > rightD :
                answer += 'R'
                nowR = [i // 3, 1]
            else :
                answer += 'L'
                nowL = [i // 3, 1]
            
    return answer
