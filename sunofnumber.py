def sum_of_series(n):
    total = 0.0
    for i in range(1, n + 1):
        total += 1 / i
    return total
n = int(input("Enter a positive integer n: "))
result =sum_of_series(n)
print(f"The sum of the series up to  1+1/2+1/3......1/{n} is: {result:.4f}")
