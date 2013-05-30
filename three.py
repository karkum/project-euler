START = 998001

def is_palindrome(num):
    return str(num) == (str(num)[::-1])

res = 0
for x in range(100, 999):
    for y in range(x+1, 999):
        if is_palindrome(x*y) and x*y > res:
            res = x*y
print(res)
