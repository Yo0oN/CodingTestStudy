def solution(s):
    answer = 0
    result = []
    
    if len(s) == 1:
        return 1
    
    for i in range(1, len(s) // 2 + 1):
        result.append(len(zip_str(s, i)))
        result.sort()
    
    return result[0]

def zip_str(string, i):
    zip_result = ""
    repeat = 1
    for x in range(0,len(string),i):
        if string[x : x + i] == string[x + i : x + 2 * i]:
            repeat += 1
        else:
            zip_result += '{}{}'.format(repeat, string[x-i : x]) if repeat > 1 else string[x : x + i]
            repeat = 1
    return zip_result
