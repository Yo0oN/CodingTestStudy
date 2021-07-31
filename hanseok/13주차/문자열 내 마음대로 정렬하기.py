def solution(strings, n):
    """print(strings)
    print(n)
    print(strings[1][1])"""
    temp = []
    answer = []
    for i in strings:
        temp.append(i[n]+i) #usun -> n번째수+문자
    print(temp)
    temp.sort() #내림차순으로 정렬
    for i in temp:
        answer.append(i[1:])#usun 첫번째 문자를 제거후 answer에 넣기
    return answer




print(solution(strings=["sun", "bed", "car"]
               ,n=1 ))