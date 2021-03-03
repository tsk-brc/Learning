import java.util.*;

/*
  衣替えが進んでいるかを確認する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 衣替えが終わっている服の数
    int count = 0;
    // 10着分確認
    for (int i = 0; i < 10; i++) {
      // 服の種類(S or W)
      String str = sc.next();
      // 冬服なら1加算する
      if (str.equals("W")) {
        count++;
      }
    }
    // 結果を出力
    if (count >= 5) {
      System.out.println("OK");
    } else {
      System.out.println("NG");
    }
  }
}