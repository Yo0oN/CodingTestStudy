def solution(strings, n):
    nArray = list(set([string[n]  for string in strings]))
    nArray.sort()
    
    sortedStrings = [[] for nn in nArray]
    for string in strings :
        i = nArray.index(string[n])
        sortedStrings[i].append(string)
    
    answer = []
    for sortedString in sortedStrings :
        sortedString.sort()
        answer += sortedString
    
    return answer
