def solution(s):
    answer = ''
    for word in s.split(' '):
        answer += "".join([word[i].upper() if i % 2 == 0 else word[i].lower() for i in range(len(word))]) + " "
    return answer[:-1]
