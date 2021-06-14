import string
import re

def solution(new_id):
    answer = ''

    new_id = new_id.lower()  # 파라미터로 받은 아이디는 모두 소문자화
    listId = list(new_id)

    for i in range(len(listId)):  # -, ., _ 를 제외한 모든 특수기호를 빈값으로 replace함
        if listId[i] in string.punctuation and listId[i] != '-' and listId[i] != '.' and listId[i] != '_':
            new_id = new_id.replace(listId[i], '')

    new_id = new_id.strip('.')  # 아이디 시작과 끝의 .을 공백처리
    new_id = re.sub('\.\.+', '.', new_id)  # 정규표현식, 문자열 내 .이 2번이상 반복되는 부분을 제거하는 식

    if len(new_id) >= 16:  # 16자 이상의 길이는 16자까지만 출력
        new_id = new_id[0:15]

    for i in range(3):
        if len(new_id) == 0:  # 아이디가 빈값이면 a를 3번 곱함
            new_id = new_id + 'a'

        if len(new_id) <= 2:  # 아이디가 3자리 수 미만이라면 제일 마지막값을 길이가 3이 될때까지 곱함
            new_id = new_id + new_id[-1]

        if len(new_id) >= 3:  # 3자리수 이상은 패스
            break

    new_id = new_id.strip('.')
    answer = new_id

    return answer