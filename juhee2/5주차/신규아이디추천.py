# 첫번째 풀이
# import re

# def solution(new_id):
#     answer = ''
    
#     new_id = new_id.lower()
#     new_id = re.sub('[^a-z0-9-_.]', '', new_id)
#     new_id = re.sub('[.]+', '.', new_id)
#     new_id = re.sub('^[.]|[.]$', '', new_id)
#     new_id = 'a' if not new_id else new_id
#     if len(new_id) >= 16:
#         new_id = new_id[:15]
#         if new_id[-1] == '.':
#             new_id = new_id[0:-1]
    
#     if len(new_id) <= 2:
#         while len(new_id) < 3:
#             new_id = new_id + new_id[-1]
        
#     return new_id

import re

def solution(new_id):
    answer = ''
    
    new_id = new_id.lower()
    new_id = re.sub('[^a-z0-9-_.]', '', new_id)
    new_id = re.sub('[.]+', '.', new_id)
    new_id = re.sub('^[.]|[.]$', '', new_id)
    new_id = 'a' if not new_id else new_id
    new_id = new_id[:15] if len(new_id) >= 16 else new_id
    new_id = re.sub('^[.]|[.]$', '', new_id) # 3단계에서 앞뒤. 있으면 제거하기 때문에 if문 안에 쓸 필요 없음
    new_id = new_id if len(new_id) > 2 else new_id + ''.join([new_id[-1] for i in range(0,3-len(new_id))]) # join 으로 리스트요소 문자열로 연결
    
    return new_id
