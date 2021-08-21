def solution(people, limit):
    answer = 0
    
    people.sort(reverse=True)
    
    start = 0 # 앞사람 인덱스
    end = len(people) - 1 # 마지막 사람 인덱스
    
    while start <= end : # 이제 탈사람이 마지막사람을 넘어서면 중단
        answer += 1
        if people[start] + people[end] <= limit :
            end -= 1
        start += 1
    
    # while people :
    #     boat = people.pop(0) # 배에 사람 태우기
    #     if people and boat + people[-1] <= limit : # 사람 한명 더 탈수있으면 태우기
    #         people.pop()
    #     answer += 1
    return answer
