#Input 1 = 10
#Input 2 = 64630 11735 14216 99233 14470 4978 73429 38120 51135 67060


ignore = int(input()) #Ignore N!
x = list(map(float, input().split()))

# Don't reinvent the wheel ...
import statistics
mean = statistics.mean(x) 
median = statistics.median(x) 
mode = statistics.mode(sorted(x))

print(round(mean,1)) 
print(round(median,1)) 
print(round(mode,1))