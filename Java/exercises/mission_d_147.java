import java.util.*;

/*
  溜められる水の量を計算する。
  ただし周囲を囲っている高さが不揃いで、一番背の低いところまでしか水がためられないものとする。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 底面積
    int tei = Integer.parseInt(sc.next());
    // 最小の高さ
    int minHeight = 0;
    // 各高さについてチェック
    for (int i = 0; i < 4; i++) {
      // 該当の面の高さ
      int height = Integer.parseInt(sc.next());
      // 初期値なら上書き
      if (minHeight == 0) {
        minHeight = height;
      }
      // 最小値よりも小さければ上書き
      if (height < minHeight) {
        minHeight = height;
      }
    }
    // 結果を出力
    System.out.println(tei * minHeight);
  }
}