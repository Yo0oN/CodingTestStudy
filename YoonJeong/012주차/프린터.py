def solution(priorities, location):
    answer = 0
    
    while priorities :
        if location == 0 and priorities[0] == max(priorities) : # 출력하려는 값이 최댓값이고, 이제 출력할차례라면
            answer += 1
            break            
        elif priorities[0] < max(priorities) : # 이제 나올것이 최댓값이 아니라면 뒤로 보냄
            priorities.append(priorities.pop(0))
            if location - 1 < 0 : # 이제 나올것이 내가 출력하려는것이었다면 location이 마지막번호가됨
                location = len(priorities) - 1
            else : # 내가 출력할게 아니었다면 -1
                location -= 1
        else : # 만약 처음값이 내가 출력할것이 아님, 최댓값이었다면 출력
            priorities.pop(0)
            answer += 1
            location -= 1
        
    return answer
