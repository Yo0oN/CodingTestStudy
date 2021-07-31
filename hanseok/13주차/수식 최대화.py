import re
import itertools

def solution(expression):
    opers = list(itertools.permutations(['-','+','*'],3))
    print(opers)
    #itertools 순열을 사용하여 연산순서 자동으로 만들기
    expression = re.split('([-+*])',expression) #정규식으로 숫자, 연산자 나누기
    print(expression)
    answer = []
    for oper in opers:
        exp = expression[:] #순열만큼 while문도 새로 돌아야 하므로 초기화
                            #[:] -> list 복사
        for i in oper: #['-','+','*'] 연산순서 -,+,*
            while i in exp: #위의 연산자가 없어질때까지 반복
                idx = exp.index(i)
                exp[idx-1] = str(eval(exp[idx-1] + i + exp[idx+1]))
                    #eval 함수 = 문자열로 식을 입력해도 실행한 결과값을 반환해준다
                    #eval로 변환하면 정수형이 되므로 str로 다시 문자열로 변경해야한다
                    #연산자 앞,뒤를 계산한다.
                    #계산한 앞에 넣는다 expression[idx-1]
                del exp[idx:idx+2]
                    #연산자와 연산자 뒤에수를 지운다
        answer.append(abs(int(exp[0]))) #문자열 숫자로 변경, 절댓값으로 변경

    return max(answer)

print(solution(expression="100-200*300-500+20"))