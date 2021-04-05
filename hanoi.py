N = int(input())
global Count



def h(N, s, t, v):
    if (N == 1):
        print (s, t)

    else:
        h(N-1, s, v, t)
        print (s, t)

        h(N-1, v, t, s)

print(2**N -1)
h(N, 1, 3, 2)