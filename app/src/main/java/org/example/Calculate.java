package org.example;

public class Calculate {
  public int sum(int x, int y, int flag) {
    int z = 0;
    if (flag == 0) {
      z = x + y;
    } else if (flag == 1) {
      for (int i = x; i <= y; i++) {
        z += i;
      }
    } else if (flag == 2) {
      for (int i = x; i <= y; i++) {
        if (i % 2 == 1) {
          z += i;
        }
      }
    } else if (flag == 3) {
      for (int i = x; i <= y; i++) {
        if (i % 2 == 0) {
          z += i;
        }
      }
    }
    return z;
  }

  public float average(int sum, int num) {
    float z = sum;
    return z / num;
  }
}
