# Implement bubble-sort
# Input = n (nDim) & a (array)


if __name__ == '__main__':
    n = int(input().strip())
    arr = list(map(int, input().rstrip().split()))

    def bubble_sort(n, arr):

        n_swaps = int(0)

        for i in range(n):
            for j in range(n - 1):
                if arr[j] > arr[j + 1]:
                    tmp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = tmp
                    n_swaps += 1

            if n_swaps == 0:
                break

        return n_swaps, arr

    def print_solution(counter_sort, arr):
        print(f'Array is sorted in {str(counter_sort)} swaps.')
        print(f'First Element: {str(arr[0])}')
        print(f'Last Element: {str(arr[-1])}')
        return

    n_swaps, sorted_arr = bubble_sort(n, arr)
    print_solution(n_swaps, sorted_arr)
