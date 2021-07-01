def solution(n, arr1, arr2):
    answer = []
    for a,b in zip(arr1, arr2):
        format(a | b, 'b')
        row = ''.join(['#' if i == '1' else ' ' for i in format(a | b, 'b')])
        row = ' ' * (n - len(row)) + row if len(row) < n else row
        answer.append(row)
    return answer
