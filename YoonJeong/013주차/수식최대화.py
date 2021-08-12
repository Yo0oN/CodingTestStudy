import itertools

def solution(expression):
    answer = []
    
    ops = ['-', '+', '*']
    express = []
    i = 0
    for e in range(len(expression)) :
        if expression[e] in ops :
            express.append(expression[i:e])
            express.append(expression[e:e+1])
            i = e + 1
    else :
        express.append(expression[i:e+1])
    
    ops = [op for op in ops if op in expression]
    for oper in itertools.permutations(ops) :
        exp = expression[:]
        for i in oper :
            while i in express :
                idx = express.index(i)
                express[idx - 1] = str(eval(express[idx - 1] + i + express[idx + 1]))
                del express[idx : idx+2]
        answer.append(abs(int(express[0])))
    
    return max(answer)
