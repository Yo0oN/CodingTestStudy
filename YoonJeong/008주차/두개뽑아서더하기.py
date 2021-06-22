from itertools import combinations

def solution(numbers):
    answer = set()
    
    for combi in combinations(numbers, 2) :
        answer.add(sum(combi))
    
    return sorted(answer)
