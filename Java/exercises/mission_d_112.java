import java.util.*;

/*
  1日にいくつの商品が生産されているのかを計算する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 1時間あたりの生産数
    int num1 = Integer.parseInt(sc.nextLine());
    // 稼働時間(h)
    int num2 = Integer.parseInt(sc.nextLine());
    // 1日あたりの生産数
    System.out.println(num1 * num2);
  }
}