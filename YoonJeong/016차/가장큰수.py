def solution(numbers):
    # 문자열 비교를 위해 4자리수, 문자열로 변경
    # 만약 32와 3이 있다면 32가 큰수지만 둘이 합쳤을때 323보다는 332가 더 크다.
    # 그래서 자릿수를 같게 만들어 3232와 3333으로 비교하여 3이 앞으로 오도록 한다.
    # 배열에는 [4자리 문자열로 변한 수, 원래수]가 들어감
    newNumbers = [[(str(number) * 4)[:4], str(number)] for number in numbers]
    
    # 큰수가 나와야하니 역순으로 정렬. 4자리 문자열로 변한 수를 기준으로 정렬된다.    
    newNumbers.sort(reverse = True)
    # 정렬된 순서 그대로 원래 수들을 합쳐준다.
    answer = str(int(''.join([item[1] for item in newNumbers])))
    
    return answer
