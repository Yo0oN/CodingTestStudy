def solution(s):
    numbers = ['zero', 'one', 'two','three','four','five','six','seven','eight','nine']
    for i in range(len(numbers)):
        s = s.replace(numbers[i], str(i))
    
    return int(s)
