import string
def solution(name):
    alpha = string.ascii_uppercase
    updown = 0
    min_move = len(name) - 1
    move = 0

    for i, n in enumerate(name):
        updown += alpha[::-1].index(n) + 1 if alpha.index(n) > len(alpha) // 2 else alpha.index(n)
        move += 1
        while move < len(name) and name[move] == 'A':
            move += 1
        min_move = min(min_move, i + i + len(name) - move)
    return updown + min_move
