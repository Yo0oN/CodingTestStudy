def solution(nums):
    answer = 0

    pick = len(nums) / 2
    setNums = set(nums)
    lengthSetNums = len(setNums)

    if lengthSetNums > pick:
        answer = pick
        return answer

    else:
        answer = lengthSetNums

    return answer