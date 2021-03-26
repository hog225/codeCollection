
from collections import deque

def BFS(graph, root):
    visited = []
    queue = deque([root])

    while queue:
        n = queue.popleft()
        if n not in visited:
            visited.append(n)
            if n in graph:
                temp = list(set(graph[n]) - set(visited))
                temp.sort()
                queue += temp
    return " ".join(str(i) for i in visited)




#setting mazz

N, M = [int(i) for i in input().split(' ')]
mazz = {}
for i in range(N):
    mazz[i] = []
    Mline = input()
    for j in Mline:
        mazz[i].append(int(j))

print(mazz)