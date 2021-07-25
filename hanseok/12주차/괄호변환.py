def divide(s):
    # 균형잡힌 문자열 = '('갯수 = ')'갯수
    # 올바른 문자열   = '(())' 괄호방향이 올바르게 닫히는것
    # u -> 균형잡힌문자열이며 더이상 쪼개지지 않는 문자열
    # v -> u로 쪼갠뒤 문자열
    # divide -> u,v를 나누기 위한 함수이다
    cnt_i = 0
    cnt_j = 0
    for i in range(len(s)):
        if s[i] == '(':
            cnt_i += 1
        else: # == ')'
            cnt_j += 1
        if cnt_i == cnt_j: #균형잡힌 문자열 일시 return
            return (s[:i+1], s[i+1:]) #u=i까지, v=그뒤까지

def correct_u(u):
    result = True
    cnt = 0
    for i in range(len(u)):
        if u[0] == ')':
            result = False
            break
        if u[i] == '(':
            cnt += 1
        else: #==')'
            cnt -= 1
        if cnt < 0:
            result = False
            break
        return result


def solution(p):
    answer = ''
    # 1번 빈문자열인 경우, 빈 문자열을 반환
    if p == '':
        return ''
    # 2번 u,v로 분리
    u, v = divide(p)

    #3번 u가 올바른 괄호 문자열인지 확인
    if correct_u(u) == True:
        # 3-1 번 u가 올바른 괄호 문자열이면
        # u에 이어붙인 후 v를 다시 함수로 돌리기
        u += solution(v)
        return u
    else:
        # 4번 u가 올바른 괄호 문자열이 아닐시
        # u의 첫번째와 마지막 분자열을 제거한뒤
        # 빈문자열 answer에 '(' + solution(v) + ')' 이런식으로 올바른 문자열을 만든다
        answer += '(' # 4-1번
        answer += solution(v) # 4-2번
        answer += ')' # 4-3번

        for i in u[1:len(u)-1]: # 4-4번
            if i == '(':
                answer += ')'
            else:
                answer += '('
    return answer # 4-5번

#print(solution("(()())()"))
# print(solution(")("))
print(solution("()))((()"))