dartResult = '1D2S#10S'
stack = []
dartResult = dartResult.replace("10","K")
# 순환하며 확인하려면 10 -> 두자리 여서 예외처리 해야함 (10 -> K)
bonus = {'S':1, 'D':2, 'T':3}
#option= {'*':2, '#':-1}
# 딕셔녀리도 값 선언 (S = 1제곱, D=2제곱, T=3제곱)
print(dartResult)
for i in dartResult:
    if i.isdigit() or i == 'K':
        stack.append(10 if i == 'K' else int(i))
    elif i in ('S','D','T'):
        num = stack.pop()
        stack.append(num ** bonus[i])
    elif i == '#':
        stack[-1] *= -1 #스택의 마지막 요소 -1 곱하기
    elif i == '*':
        num = stack.pop()
        if len(stack): #stack가 남아있다면
            stack[-1] *= 2 #마지막 2곱하기
        stack.append(2*num)
print(sum(stack))

def solution(dartResult):
    stack = []
    dartResult = dartResult.replace("10","K")
    bonus = {'S':1, 'D':2, 'T':3}
    for i in dartResult:
            if i.isdigit() or i == 'K':
                stack.append(10 if i == 'K' else int(i))
            elif i in ('S','D','T'):
                num = stack.pop()
                stack.append(num ** bonus[i])
            elif i == '#':
                stack[-1] *= -1
            elif i == '*':
                num = stack.pop()
                if len(stack):
                    stack[-1] *= 2
                stack.append(2*num)
    return (sum(stack))

