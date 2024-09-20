package br.lpm;

public class RevisaoAed {

  public int fibLoop(int n) {
    if (n == 1) {
      return 1;
    } else if (n == 2) {
      return 1;
    } else if (n > 2) {
      int n1 = 1;
      int n2 = 1;
      int fib = n2;
      for (int i = 3; i <= n; i++) {
        fib = n1 + n2;
        n1 = n2;
        n2 = fib;
      }
      return fib;
    } else {
      return 0;
    }
  }

  public int fibRec(int n) {
    if (n == 1) {
      return 1;
    } else if (n == 2) {
      return 1;
    } else if (n > 2) {
      return fibRec(n - 1) + fibRec(n - 2);
    } else {
      return 0;
    }
  }
}
