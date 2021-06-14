def solution(record):
    answer =[]
    users = {}

    logs = [list(i.split()) for i in record]

    for i in record:
        recordList = i.split(' ')

        if recordList[0] != 'Leave':
            users[recordList[1]] = recordList[2]  # 제일 마지막 아이디의 닉네임이 들어감

    for command in logs:

        if command[0] == 'Enter':
            answer.append(users[command[1]] + "님이 들어왔습니다.")
        elif command[0] == 'Leave':
            answer.append(users[command[1]] + "님이 나갔습니다.")

    return answer