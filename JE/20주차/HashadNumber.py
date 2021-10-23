def solution(x):
    answer = True
    nums = [i for i in str(x)]
    total = 0

    for num in nums:
        total += int(num)

    if x % total != 0:
        return False

    return answer