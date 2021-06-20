def solution(s):
    answer = []
    result = ""

    if len(s) == 1: # 문자열 길이 1은 무조건 1 리턴
        return 1

    for cut in range(1, len(s) // 2 + 1): # 절반까지만 확인하면 됨
        count = 1
        check = s[:cut]
        for i in range(cut, len(s), cut):
            if s[i:i+cut] == check: # 다음 문자열과 같다면
                count += 1
            else: # 다음 문자열과 다를 경우
                if count == 1:
                    count = ''
                result += str(count) + check # 여태까지 세어진 숫자와 문자열을 이어붙이기
                check = s[i:i+cut] # 다음 비교대상
                count = 1 # 카운트는 1로 초기화

        if count == 1: # 카운트1개는 숫자를 이어붙이지 않음
            count = ''

        # 카운트가 1보다 클 경우
        result += str(count) + check
        answer.append(len(result))
        result = ''

    return min(answer)