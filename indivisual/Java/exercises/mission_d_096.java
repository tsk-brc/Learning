import java.util.*;

/*
  誤認しやすい文字が含まれているかどうかを判定する。
  なお、誤認しやすい文字は「I」(大文字のアイ)と「l」(小文字のエル)と「i」(小文字のアイ)とする。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String target = sc.nextLine();
    // 判定結果
    boolean cautionFlg = false;
    // 文字数分ループ
    for (int i = 0; i < target.length(); i++) {
      // N文字目の文字
      String str = target.substring(i, i + 1);
      // 誤認文字か判定
      if (str.equals("I") || str.equals("l") || str.equals("i")) {
        cautionFlg = true;
        break;
      }
    }
    // 結果を出力
    if (cautionFlg) {
      System.out.println("caution");
    } else {
      System.out.println(target);
    }
  }
}