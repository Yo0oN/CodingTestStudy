def solution(p):
    if not p : # p가 빈문자열이면 그대로 반환
        return p
    
    answer = ''
    
    u, v = separ(p) # p를 u와 v로 분리
    if isBalanced(u) : # u가 올바른 문자열일경우 v를 1번(=solution)부터 수행. v가 올바른 문자열이 될때까지 재귀적으로 작동
        return u + solution(v)
    else : # u가 올바른 문자열이지 않을 경우 4번(=merge) 수행
        answer = merge(u, v)
    
    return answer

def separ(w):
    u = ''
    v = ''
    for i in range(len(w)) :
        if u != '' and u.count('(') == u.count(')') :
            v = w[i:]
            break
        u += w[i]
    return u, v

def isBalanced(u) :
    uStack = []
    for uu in u :
        if uStack and uStack[-1] == '(' and uu == ')' :
            uStack.pop()
        else :
            uStack.append(uu)
    if uStack : # u가 올바른 문자열이 아니라면
        return False
    return True

def merge(u, v) :
    newU = '(' + solution(v) + ')'
    for uu in u[1 : -1] :
        if uu == '(' :
            newU += ')'
        else :
            newU += '('
    return newU
