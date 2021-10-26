def solution(numbers):
    answer = ''
    numbers = list(map(str, numbers))
    numbers.sort(key = lambda x : x*3, reverse=True)

    answer = ''.join(numbers)
    return answer