def find_max_bitwise(n, k):
    max_bitwise = 0
    for i in range(1, n + 1):
        for j in range(1, i):
            bitwise = i & j

            if max_bitwise < bitwise < k:
                max_bitwise = bitwise
                
                if max_bitwise == k - 1:
                    return max_bitwise

    return max_bitwise


n_cases = int(input())
for t_itr in range(n_cases):
    tmp = input().split()

    n = int(tmp[0])

    k = int(tmp[1])

    print(find_max_bitwise(n, k))
