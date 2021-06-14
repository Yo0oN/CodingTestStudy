def solution(numbers, hand):
    answer = ''

    left = 10  # *을 10으로 치환
    right = 12  # #을 12로 치환

    for i in numbers:

        if i == 1 or i == 4 or i == 7:
            answer += 'L'
            left = i

        elif i == 3 or i == 6 or i == 9:
            answer += 'R'
            right = i

        else:  # 2/5/8/0을 누를 때
            if i == 0:  # 0은 11로 치환
                i = 11
            else:
                pass

            # 왼쪽, 오른쪽 간의 거리구하기
            leftDistance = abs(i-left)
            rightDistance = abs(i-right)

            if sum(divmod(leftDistance, 3)) > sum(divmod(rightDistance, 3)):
                answer += 'R'
                right = i
            elif sum(divmod(leftDistance, 3)) < sum(divmod(rightDistance, 3)):
                answer += 'L'
                left = i
            else:  # 거리가 같은 경우
                if hand == 'left':
                    answer += 'L'
                    left = i
                else:
                    answer += 'R'
                    right = i

    return answer