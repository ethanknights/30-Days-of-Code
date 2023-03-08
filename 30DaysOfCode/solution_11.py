# Return the max(Hourglass summation) for an n x m matrix.
#
# Hourglass definition:
#  * * *
#    *
#  * * *
# Sample Input 1
# 1 1 1 0 0 0
# 0 1 0 0 0 0
# 1 1 1 0 0 0
# 0 0 2 4 4 0
# 0 0 0 2 0 0
# 0 0 1 2 4 0
#
# Failed Test Case 3:
# -1 -1 0 -9 -2 -2
# -2 -1 -6 -8 -2 -5
# -1 -1 -1 -2 -3 -4
# -1 -9 -2 -4 -4 -5
# -7 -3 -3 -2 -9 -9
# -1 -3 -1 -2 -4 -5


# Take input:
if __name__ == "__main__":
    arr = []
    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))
        # print(arr)


# Define matrix dimensions
n = 6  # Overridden! If np allowable, use arr.shape[0]
m = 6  # Overridden! If np allowable, use arr.shape[1]
hourglass_length = 2

# Init
# max_hourglass = 0 # Do not do this! (Negatives won't be assigned)!

for i in range(n):
    for j in range(m):
        if j + hourglass_length < m and i + hourglass_length < n:
            result = (
                #  * * *    <----
                #    *
                #  * * *
                arr[i][j]
                + arr[i][j + 1]
                + arr[i][j + 2]
                +
                #  * * *
                #    *      <----
                #  * * *
                arr[i + 1][j + 1]
                +
                #  * * *
                #    *
                #  * * *     <----
                arr[i + 2][j]
                + arr[i + 2][j + 1]
                + arr[i + 2][j + 2]
            )

            if i == 0 and j == 0:
                max_hourglass = result
            elif result > max_hourglass:
                max_hourglass = result

print(max_hourglass)
