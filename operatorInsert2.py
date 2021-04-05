N = int(input())
nums = list(map(int, input().split()))
add, sub, mul, div = map(int, input().split())

min_, max_ = 1e9, -1e9

def solve(i, res, add, sub, mul, div):
    global max_, min_
    if i == N:
        max_ = max(res, max_)
        min_ = min(res, min_)
        print('     ', i, add, sub, mul, div)
        return

    else:

        if add:
            #print('add', i, add, sub, mul, div)
            solve(i+1, res+nums[i], add-1, sub, mul, div)
        if sub:
            #print('sub', i, add, sub, mul, div)
            solve(i+1, res-nums[i], add, sub-1, mul, div)
        if mul:
            #print('mul', i, add, sub, mul, div)
            solve(i+1, res*nums[i], add, sub, mul-1, div)
        if div:
            #print('div', i, add, sub, mul, div)
            solve(i+1, int(res/nums[i]), add, sub, mul, div-1)

solve(1, nums[0], add, sub, mul, div)
print(max_)
print(min_)