# Identify fine using conditional logic (Fixed fees for year/month overdue)

# Parse input version: Map
date_returned = list(map(int, input().split()))
d, m, y = date_returned

date_due = list(map(int, input().split()))
d_due, m_due, y_due = date_due

# Parse input version: list comprehension
# d, m, y = [int(e) for e in input().strip().split(' ')]
# d_day, m_due, y_due = [int(e) for e in input().strip().split(' ')]

fine = 0

if y > y_due:  # year overdue
    fine = 10000  # fixed fee
elif y == y_due:
    if m > m_due:  # month overdue
        fine = (m - m_due) * 500
    elif m == m_due and d > d_due:  # just days overdue
        fine = (d - d_due) * 15

print(fine)
