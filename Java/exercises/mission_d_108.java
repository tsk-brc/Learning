import java.util.*;

/*
  24時間持続させるのに必要な数を求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // 24時間持続させるのに必要な数
    if (24 % Integer.parseInt(str) == 0) {
      System.out.println(24 / Integer.parseInt(str));
    } else {
      System.out.println(24 / Integer.parseInt(str) + 1);
    }
  }
}