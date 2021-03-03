import java.util.*;

/*
  時間を0〜23時で表示する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.nextLine());
    // 24時を超えていたら24を引いて出力
    if (num >= 24) {
      System.out.println(num - 24);
    } else {
      System.out.println(num);
    }
  }
}