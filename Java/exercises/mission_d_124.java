import java.util.*;

/*
  「時間」を「日」に変換する。ただし、小数点以下は切り上げる。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 時間
    int num = Integer.parseInt(sc.nextLine());
    // 「日」に変換
    if (num % 24 == 0) {
      System.out.println(num / 24);
    } else {
      System.out.println(num / 24 + 1);
    }
  }
}