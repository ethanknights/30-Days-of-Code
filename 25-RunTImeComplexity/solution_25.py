# Derive if value is prime with small runtime.

def isPrime(n):
    if n <= 1:
        return False
    sqrt_n = n ** (1/2)  # equiv of math.sqrt()
    if sqrt_n.is_integer():
        return False
    for i in range(2, int(sqrt_n)+1):
        if n % i == 0:
            return False
    return True


n_vals = int(input())
for i in range(n_vals):
    n = int(input())
    if isPrime(n):
        print('Prime')
    else:
        print('Not prime')
