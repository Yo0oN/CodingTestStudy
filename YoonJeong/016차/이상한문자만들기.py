def solution(s):
    answer = ''
    i = 0
    for ss in s :
        if ss == ' ' :
            i = 0
            answer += ss
            continue
        elif i % 2 == 0 :
            answer += ss.upper()
        else :
            answer += ss.lower()
        i += 1
    
    return answer
