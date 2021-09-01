#공백을 기준으로 문자 나누기
#짝수 -> 대문자, 홀수 -> 소문자
def solution(s):
    s = s.split(' ')
    answer = ''
    cnt = 0
    for i in s:
        for j in i:
            if cnt%2 ==0:#짝
                answer += j.upper()
            else: #홀
                answer += j.lower()
            cnt +=1
        answer += ' '
        cnt = 0

    return answer[:-1]#마지막공백 제거

print(solution(solution(s='try hello world')))