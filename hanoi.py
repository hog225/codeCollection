N = int(input())
global Count


def h(N, S, V, G):
    if N == 1:
        print(S, G)
    else:
        h(N-1, S, G, V)
        print(S, G)
        h(N-1, V, S, G)

h(N, 1, 2, 3)
