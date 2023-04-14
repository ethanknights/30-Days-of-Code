# Return the max(Hourglass summation) for an n x m matrix.

if __name__ == "__main__":
    arr = []
    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

n = 6  # Overridden! If np allowable, use arr.shape[0]
m = 6  # Overridden! If np allowable, use arr.shape[1]
hourglass_length = 2

for i in range(n):
    for j in range(m):
        if j + hourglass_length < m and i + hourglass_length < n:
            result = (

                arr[i][j]
                + arr[i][j + 1]
                + arr[i][j + 2]

                arr[i + 1][j + 1]

                arr[i + 2][j]
                + arr[i + 2][j + 1]
                + arr[i + 2][j + 2]
            )

            if i == 0 and j == 0:
                max_hourglass = result
            elif result > max_hourglass:
                max_hourglass = result

print(max_hourglass)
