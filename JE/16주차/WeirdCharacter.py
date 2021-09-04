def solution(s):
    answer = []
    s = s.split(' ')

    for word in range(len(s)):
        change = ''

        for idx in range(len(s[word])):
            if idx % 2 == 0:
                change += s[word][idx].upper()
            else:
                change += s[word][idx].lower()

        answer.append(change)

    return ' '.join(answer)