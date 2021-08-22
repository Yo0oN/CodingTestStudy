def solution(numbers):
    numbers = list(map(str,numbers))
    #numbers배열 str변환후 배열로 리턴
    numbers.sort(key=lambda x:x*3,reverse=True)
    #정렬
    # x*3 -> 해당물자열 3개 나열하는것
    # 아스키코드로 변환
    # reverse=True 정렬
    return str(int(''.join(numbers)))
    # 모든 값이 0일 때(즉, ‘000’을 처리하기 위해) int로 변환한 뒤, 다시 str로 변환한다.

print(solution(numbers=[6, 10, 2]))