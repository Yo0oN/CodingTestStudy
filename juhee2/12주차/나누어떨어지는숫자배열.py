def solution(arr, divisor):
    result = [a for a in arr if a % divisor == 0 ]
    result.sort()
    return result if len(result) > 0 else [-1]
