def solution(name):
    answer = 0
    move = len(name) - 1  # 앞에서부터 가다가 다시 A를 만났을 때 거꾸로 가기 위한 변수
    next = 0

    for i, char in enumerate(name):
        startA = ord(char) - ord('A')
        startZ = ord('Z') - ord(char) + 1

        answer += min(startA, startZ)  # 맨앞, 맨뒤 어느쪽이 더 가까운지를 판별

        next += 1  # 다음 문자열 비교를 위해 인덱스 이동

        while next < len(name) and name[next] == 'A':  # 잘 가다가 A를 만나게 될 경우 연속되는 A의 마지막값저장
            next += 1

        back = i + i + len(name) - next

        if move > back:  # 뒤에서 카운팅이 더 짧을 경우 그 수를 move에 저장
            move = back

    answer += move

    return answer