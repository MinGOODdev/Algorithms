package programmers.level1;

import java.util.Arrays;

public class 최대공약수와_최소공배수 {
  public int[] gcdlcm(int a, int b) {
    int[] answer = new int[2];

    if (a <= b) {
      for (int i = 1; i <= a; ++i) {      // i를 작은 수까지 (0부터가 아니고 1부터)
        if (a % i == 0 && b % i == 0) {   // a, b 모두 나누어 떨어질 경우
          answer[0] = i;                  // 최대공약수 저장
          answer[1] = a * (b / i);        // 최소공배수 저장
        }
      }
    }
    else {
      for (int i = 1; i <= b; ++i) {
        if (a % i == 0 && b % i == 0) {
          answer[0] = i;
          answer[1] = b * (a / i);
        }
      }
    }
    return answer;
  }


  public static void main(String[] args) {
    최대공약수와_최소공배수 c = new 최대공약수와_최소공배수();
    System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
  }
}
