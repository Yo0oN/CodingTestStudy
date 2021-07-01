def solution(numbers, target):
    sup = [0]
    for num in numbers:
        sub = []
        for sup_num in sup:
            sub.append(sup_num + num)
            sub.append(sup_num - num)
        sup = sub
        
    return sup.count(target)
