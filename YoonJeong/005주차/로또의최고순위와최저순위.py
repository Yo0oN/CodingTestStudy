def solution(lottos, win_nums):
    answer = []
    #맞은 개수
    same_nums = len([i for i in lottos if i in win_nums])
    #0의 개수
    zero_nums = lottos.count(0)
    #등수가 적혀있는 배열. [6, 6, 5, 4, 3, 2, 1]로, 맞은 개수가 인덱스가되고, 값이 등수가 된다.
    rank = [i if i != 7 else 6 for i in range(7, 0, -1)]
    #최고순위
    answer.append(rank[same_nums + zero_nums])
    #최저순위
    answer.append(rank[same_nums])
    return answer
