def solution(dartResult):
    answer = 0
    score = []
    sdt = {'S':1, 'D':2, 'T':3}

    for letter in dartResult:

        # 1~9까지의 수일 경우는 그냥 더해줌
        if letter.isdigit() and 0 < int(letter) < 10:
            answer += int(letter)

        # 숫자가 0인 경우 (answer가 비어있어야 0으로 간주)
        elif letter.isdigit() and int(letter) == 0 and answer == 0:
            answer += int(letter)

        # 숫자가 10일 경우의 처리 (먼저 1이 더해져있을 것이기 때문에 answer가 1인지 확인 후, 10으로 변경)
        elif letter.isdigit() and int(letter) == 0 and answer == 1:
            answer = 10

        # 보너스 점수(SDT) 계산하기
        elif letter in sdt:
            score.append(answer ** sdt[letter])
            answer = 0  # 다음 점수 계산을 위해 초기화

        # 맨 마지막 점수와 그 이전 점수만 x2를 해주기 때문에 score[-2:] 만큼 잘라서 target에 저장 후 곱셈연산 진행
        elif letter == '*':
            target = score[-2:]
            score[-2:] = [i * 2 for i in target]

        # score의 맨 마지막 점수를 음수로 변경한다.
        elif letter == '#':
            score[-1] = -score[-1]

    answer = sum(score)

    return answer