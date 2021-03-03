import java.util.*;

/*
  全ての桁の数字が同じかどうか判定する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // 比較した結果
    Boolean checkFlg = true;
    // 文字列分ループ
    for (int i = 1; i < str.length(); i++) {
      // N文字目とN+1文字目が同じか判定
      if (!str.substring(i - 1, i).equals(str.substring(i, i + 1))) {
        checkFlg = false;
        break;
      }
    }
    // 結果を出力
    if (checkFlg) {
      System.out.println(str);
    } else {
      System.out.println("No");
    }
  }
}