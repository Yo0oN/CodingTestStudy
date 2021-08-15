from itertools import permutations

def solution(expression):
    operators = ["*", "+", "-"]
    answer = []
    for oper in permutations(operators, 3):
        tmp_exp = [""]
        for exp in expression:
            if exp.isdigit() and tmp_exp[-1] not in operators:
                tmp_exp[-1] += exp
            else:
                tmp_exp.append(exp)
        for o in oper:
            while o in tmp_exp:
                idx = tmp_exp.index(o)
                tmp_exp = tmp_exp[:idx-1]+[str(eval("".join(tmp_exp[idx-1:idx+2])))]+tmp_exp[idx+2:]
        answer.append(abs(int(tmp_exp[0])))
    return max(answer)
