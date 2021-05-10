def solution(participant, completion):
    answer = ''
    participant.sort()
    completion.sort()

    for i in range(len(participant)) :
        # 만약 참가자 배열의 마지막인 경우 마지막 값이 완주하지 못한 선수
        if i == len(participant) :
            answer = participant[i]
            break
        # 만약 참가자와 완주자가 다를 경우 해당 값이 완주하지 못한 선수
        if participant[i] != completion[i] :
            answer = participant[i]
            break
            
    return answer
