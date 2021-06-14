# 순서를 변경하면 안됨 
# 백준 14888
# 시간초과 ~~~~~~~~~~~~~~~~~~!!!!!!!!!!!!!!!
#수의 개수
N = int(input())
# 수 
numberList = [int(i) for i in input().split(" ")]
opList = []

formOpList = ["+", "-", "*", "/"]
for i, v in enumerate(input().split(" ")):

    if int(v) != 0:
        for j in range(int(v)):
            opList.append(formOpList[i])
  
checkOp = [False for i in range(len(opList))]
realOpList = ["" for i in range(len(opList))]
#operatoer

count = 0
minVal = ""
maxVal = ""
tmpVal = 0

def calculat(op, n1, n2):
    if op == "+":
        return n1 + n2
    elif op == "-":
        return n1 - n2
    elif op == "*":
        return n1 * n2
    elif op == "/":
        return int(n1 / n2)


def allCase(idx, N):
    global count
    global minVal
    global maxVal
    global tmpVal
    if idx == N-1:
        tmpVal= numberList[0]
        for i in range(1, len(numberList)):
            tmpVal = calculat(realOpList[i-1], tmpVal, numberList[i])


        if minVal == "" or minVal >= tmpVal:
            minVal = tmpVal

        if maxVal == "" or maxVal <= tmpVal:
            maxVal = tmpVal


        count += 1

        return


    for i in range(0, N-1):
        if checkOp[i] == False:
            checkOp[i] = True
            realOpList[idx] = opList[i]
            allCase(idx+1, N)
            checkOp[i] = False



allCase(0, N)
#print(count, minVal, maxVal)
print(maxVal)
print(minVal)

# a = ["+", "+", "/", "-","*"]
# b = [1,2,3,4,5,6]
# tmpVal = b[0]
# for i in range(1, len(b)):
#     print(tmpVal)
#     tmpVal = calculat(a[i-1], tmpVal, b[i])
#
# print('33', tmpVal)

# static boolean[] visited = new boolean[10];
# static int[] numbers = new int[11];
# static int[] op = new int[10];
# static int n, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
 
# private void solve() {
#     n = sc.nextInt();
#     int idx = 0;
 
#     for (int i = 0; i < n; i++) {
#         numbers[i] = sc.nextInt();
#     }
 
#     for (int i = 0; i < 4; i++) {
#         int cnt = sc.nextInt();
#         for (int j = 0; j < cnt; j++) {
#             op[idx++] = i + 1;
#         }
#     }
 
#     dfs(0, 1, numbers[0], 0);
#     System.out.println(max);
#     System.out.println(min);
# }
 
# public static void dfs(int v, int idx, int num, int len) {
#     int result = 0;
 
#     if (len == n - 1) {
#         if (num > max) {
#             max = num;
#         }
#         if (num < min) {
#             min = num;
#         }
#     } else {
#         for (int i = 0; i < n - 1; i++) {
#             if (!visited[i]) {
#                 switch (op[i]) {
#                     case 1:
#                         result = num + numbers[idx];
#                         break;
#                     case 2:
#                         result = num - numbers[idx];
#                         break;
#                     case 3:
#                         result = num * numbers[idx];
#                         break;
#                     case 4:
#                         result = num / numbers[idx];
#                         break;
#                 }
#                 visited[i] = true;
#                 dfs(i, idx + 1, result, len + 1);
#             }
#         }
#     }
#     // backtracking
#     visited[v] = false;
# }


# 출처: https://mygumi.tistory.com/242 [마이구미의 HelloWorld]