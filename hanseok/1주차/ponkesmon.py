def solution(nums):
    answer = 0
    length = int(len(nums) / 2)
    setLen = len((list(set(nums))))

    if setLen > length:
        answer = length
    else:
        answer = setLen
    return answer