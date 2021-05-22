
def soution(s):
    stack = [] # 위의 s를 list로 쓰면 문자열 형식으로 들어가 pop...가 안된당
    for i in s:
        if not stack: #빈 리스트 확인
                      #맨 처음값은 무조건 append 되도록
            stack.append(i)
            continue #밑의 if문이 돌아서 넘겨줘야함
        elif stack[-1] == i: #stack[-1] 리스트 stack의 마지막 요솟값
            stack.pop(-1) # stack마지막 요소값을 지우고 다음 for 문으로 도는거
        else:
            stack.append(i)
    if stack: return 0 # true = 0, flse = 1
    else: return 1

print(soution(s = "baabaa"))
#print(soution(s = "cdcd"))
#s = "baabaa" #파이썬에서 문자열은 ['b','a','a'...] 문자열로 들어온다