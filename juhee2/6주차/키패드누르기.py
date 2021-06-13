def solution(numbers, hand):
    answer = ''
    
    key_pad = {
                1:(0,0), 2:(0,1), 3:(0,2),
                4:(1,0), 5: (1,1), 6:(1,2),
                7:(2,0), 8:(2,1), 9:(2,2),
                '*':(3,0), 0:(3,1),'#':(3,2)
    }
    
    l = [1,4,7]
    r = [3,6,9]
    l_hand = '*'
    r_hand = '#'
    
    for n in numbers: 
        if n in l:
            l_hand = n
            answer += 'L'
        elif n in r:
            r_hand = n
            answer += 'R'
        else:
            target_pos = key_pad[n]
            l_pos = key_pad[l_hand]
            r_pos = key_pad[r_hand]
            
            l_dist = abs(target_pos[0] - l_pos[0]) + abs(target_pos[1] - l_pos[1])
            r_dist = abs(target_pos[0] - r_pos[0]) + abs(target_pos[1] - r_pos[1])
            
            if l_dist > r_dist:
                r_hand = n
                answer += 'R'
            elif l_dist < r_dist:
                l_hand = n
                answer += 'L'
            else:
                if hand == 'left':
                    l_hand = n
                    answer += 'L'
                else:
                    r_hand = n
                    answer += 'R'
                    
    return answer
