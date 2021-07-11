def solution(dartResult):
    area = ['S', 'D', 'T']
    score, round_score = '', []
    for i in dartResult:
        if i.isdigit():
            score += i
        elif i in area:
            round_score.append(int(score) ** (area.index(i) + 1))
            score = ''
        elif i == '*':
            # round_score = [round_score[i] if i < len(round_score) -2 else round_score[i] * 2 for i in range(len(round_score))]
            round_score[-2:] = [rs * 2 for rs in round_score[-2:]]
        elif i == '#':
            round_score[-1] = -(round_score[-1])
    return sum(round_score)
