# people 오름차순으로 정렬뒤
# 맨앞값과 맨마지막 값 limit 보다 작거나 같으면 str값을 1올려준다
# if문이 끝나면 end값은 1올려준다 -> 맨마지막사람이 혼자 보트를 탄거
# str값이 end값보다 커지거나 같으면 while문 종료

def solution(people, limit):
    answer = 0
    people.sort()
    str =0
    end = len(people)-1

    while str <= end:
        answer+=1
        if people[str] + people[end] <= limit:
            str += 1
        end -= 1

    return answer


print(solution(people=[70, 50, 80, 50]
               ,limit=100))