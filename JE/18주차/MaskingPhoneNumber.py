def solution(phone_number):
    answer = ''

    phone_number = str(phone_number)
    if len(phone_number) >= 4 and len(phone_number) <= 20:
        for i in range(0, len(phone_number) - 4):
            answer += phone_number[i].replace(phone_number[i], "*")

    leftChr = phone_number[-4:]
    answer += leftChr

    return answer