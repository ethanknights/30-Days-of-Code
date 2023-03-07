# Print subscript of binary input

n = int(input().strip())

binary = bin(n)  # print binary

total = 0
tmp = 0
for i in binary:
    if i == "1":
        tmp += 1
    else:
        total = max(total, tmp)
        tmp = 0
total = max(total, tmp)

print(total)
