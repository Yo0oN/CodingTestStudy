def solution(record):
    answer = []
    #3개의 단어로 구성된 문자열을 다시 배열로 분리
    record = [i.split() for i in record]
    #dictionary에 유저 아이디를 키, 닉네임을 값으로 하여 저장
    recordDict = {r[1] : r[2] for r in record if r[0] != 'Leave'}
    #들어왔을 때와 나갔을 때 문구를 다르게 하여 answer에 저장
    for r in record :
        if r[0] == 'Enter' :
            answer.append(recordDict[r[1]] + '님이 들어왔습니다.')
        elif r[0] == 'Leave' :
            answer.append(recordDict[r[1]] + '님이 나갔습니다.')

    return answer
