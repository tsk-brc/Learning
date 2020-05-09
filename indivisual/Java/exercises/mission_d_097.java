import java.util.*;

/*
  梅雨かどうか判定する。
  梅雨の条件は1週間(7日間)のうち、5日間以上が雨であれば梅雨とする。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 雨の日
    int rainy = 0;
    // 1週間分判定
    for (int i = 0; i < 7; i++) {
      String str = sc.next();
      // 雨かどうか判定(雨:1,晴れ:0)
      if (str.equals("1")) {
        rainy++;
      }
    }
    // 結果を出力
    if (rainy >= 5) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}