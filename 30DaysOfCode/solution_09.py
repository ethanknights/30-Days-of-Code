# Compute factorial of a given integer using recursion

val = int(input().strip())


def calc_factorial(factorial):
    # create range of vals to multiply by
    r = range(0, factorial, 1)
    r = r[::-1]

    for rr in r:
        # print(rr)
        if rr != 0:
            factorial = factorial * rr
            # print(factorial)

    return factorial


factorial = calc_factorial(val)
print(factorial)
