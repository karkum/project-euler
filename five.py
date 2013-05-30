'''
Problem: 520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

Answer: 232792560

Algorithm: brute force :(, really slowwww
'''
def works(n):
    for x in range(1,20):
        if not n % x == 0:
            return False
    return True

for y in range(1, 280000000):
    if works(y):
        print(y)
        break
