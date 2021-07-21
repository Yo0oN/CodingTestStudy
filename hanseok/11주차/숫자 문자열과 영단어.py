def solution(s):
    dic = {"one": "1", "two": "2", "three": "3", "four": "4", "five": "5",
        "six": "6", "seven": "7", "eight": "8", "nine": "9", "zero": "0"}
    temp = ''
    answer= ''

    for i in s:
        if i.isdigit():
            answer += i
        else:
            temp += i
            if temp in dic.keys():
                answer += dic[temp]
                temp = ''
    return int(answer)