def solution(x):
    stringX = [int(i) for i in str(x)]
    
    if x % sum(stringX) == 0 :
        return True
    return False
