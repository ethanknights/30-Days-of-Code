val = int(input().strip())

def calc_factorial(factorial):
    r = range(0, factorial, 1)
    r = r[::-1]
    for rr in r:
        if rr != 0:
            factorial = factorial * rr
    return factorial


factorial = calc_factorial(val)
print(factorial)
