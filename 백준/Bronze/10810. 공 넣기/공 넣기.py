n, m = map(int, input().split())

box = [0] * n

for time in range(m):
    i, j, k = map(int, input().split())
    for change in range(i, j+1):
        box[change-1] = k
        
for q in box:
    print(q, end=' ')