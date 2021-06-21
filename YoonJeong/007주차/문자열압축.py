def solution(s):
    answer = len(s)

    for i in range(1, len(s) // 2 + 1) : # 길이가 홀수일 경우를 위해 +1
        newSLen = 0
        patternCount = 0
        pattern = ''
        
        for j in range(0, len(s), i) :
            if pattern == '' : # 처음 시작이면 비교 안하고 넘어감, 문자열 길이에 확인된 문자 수 더함
                pattern = s[j : j + i]
                newSLen += len(s[j : j + i])
                
            elif pattern != s[j : j + i] : # 패턴이 달라졌다면 새로운 패턴 시작
                if patternCount > 0 : # 기존 패턴 중복이 여러번일경우 패턴 몇번인지 더함
                    newSLen += len(str(patternCount + 1))
                pattern = s[j : j + i]
                newSLen += len(s[j : j + i])
                patternCount = 0
                
            elif pattern == s[j : j + i] : # 이전 패턴과 이후 패턴이 같을 경우 patternCount++
                patternCount += 1
                
        if patternCount > 0 : # 다 끝난 후 아직 더해지지 않은 패턴 중복이 있다면..
            newSLen += len(str(patternCount + 1)) # 패턴 몇번인지 더함
            
        if answer > newSLen :
            answer = newSLen
            
    return answer
