def solution(record):
    answer = []
    
    commend = [r.split(' ') for r in record]
    user = {c[1] : c[2] for c in commend if c[0] != 'Leave'}
    
    for c in commend:
        if c[0] == 'Enter':
            answer.append('{}님이 들어왔습니다.'.format(user[c[1]]))
        elif c[0] == 'Leave':
            answer.append('{}님이 나갔습니다.'.format(user[c[1]]))
    return answer
