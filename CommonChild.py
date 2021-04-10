function LCS(x, y) {
  var i = x.length;
  var j = y.length;
  var result = [];
  for (var k = 0; k <= i; k++) {
    if (!result[k]) {
      result[k] = []; // 이전 계산 값 저장 공간
    }
  }
  for (k = 0; k <= i; k++) {
    for (var l = 0; l <= j; l++) {
      console.log(k, l);
      if (k === 0 || l === 0) { // 베이스 값 설정
        result[k][l] = 0;
      } else if (x[k - 1] === y[l - 1]) { // 마지막 두 문자 비교, 같으면
        result[k][l] = result[k - 1][l - 1] + 1;
      } else { // 마지막 두 문자가 다르면
        result[k][l] = Math.max(result[k - 1][l], result[k][l - 1]);
      }
    }
  }
  return result[i][j];
}
LCS('ABCBDAB', 'BDCABA'); // 4