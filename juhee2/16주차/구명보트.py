def solution(people, limit):
    answer = 0
    left = 0
    right = len(people) -1
    
    people.sort(reverse=True) # 정렬
    while True:
        if left > right:
            break
        answer += 1
        if people[left] + people[right] > limit:
            left += 1
        else:
            left += 1
            right -= 1
    return answer
