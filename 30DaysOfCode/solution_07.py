# Reverse an array
n = int(input().strip())
arr = list(map(int, input().rstrip().split()))

# Method 1:
# print(f'Array: {list(reversed(arr))}')

# Method 2 Slicing:
reversedArray = arr[::-1]

for num in reversedArray:
    print(str(num) + " ", end="")
