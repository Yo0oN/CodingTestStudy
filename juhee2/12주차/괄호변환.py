def solution(p):
    answer = ''
    
    if not p: return p
    
    u,v = divide(p)
    
    if is_correct(u):
        return u + solution(v)
    else:
        answer += '(' + solution(v) + ')'
        new_u = ''
        for i in u[1:-1]:
            if i == '(':
                new_u += ')'
            else:
                new_u += '('
        answer += new_u
        return answer
    
def divide(p):
    left,right = 0,0
    for i in p:
        if i == '(':
            left += 1
        else:
            right += 1
        
        if left == right:
            return p[:left+right], p[left+right:]

def is_correct(balanced_str):
    stack = []
    for i,b in enumerate(balanced_str):
        if i == 0:
            stack.append(b)
            continue
        
        if stack and stack[-1] == '(' and b ==')':
            stack.pop()
        else:
            stack.append(b)
    return False if stack else True
