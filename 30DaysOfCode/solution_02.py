#!/bin/python3
#
# Complete the 'solve' function below.
#
# The function accepts following parameters:
#  1. DOUBLE meal_cost
#  2. INTEGER tip_percent
#  3. INTEGER tax_percent


meal_cost = float(input())
tip_percent = int(input())
tax_percent = int(input())


def solve(meal_cost, tip_percent, tax_percent):
    # Write your code here
    tip_cost = (tip_percent * meal_cost) / 100
    tax_cost = (tax_percent * meal_cost) / 100
    total_cost = meal_cost + tip_cost + tax_cost

    return total_cost


total_cost = solve(meal_cost, tip_percent, tax_percent)

print(round(total_cost))
