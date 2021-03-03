import java.util.*;

public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 最大の底辺
    int num1 = Integer.parseInt(sc.next());
    // 最大の長さ
    int num2 = Integer.parseInt(sc.next());
    // 条件を満たす三角形の個数
    int cnt = 0;
    // 三角形の個数を算出する
    for (int i = 0; i < num1 - 1; i++) {
      // 高さ
      int tate = i + 1;
      for (int j = 0; j < num2 - 1; j++) {
        // 底辺
        int yoko = j + 1;
        // 斜辺の長さ
        double num3 = Math.sqrt(Math.pow(tate, 2) + Math.pow(yoko, 2));
        // doubleをintに変換
        int num4 = (int) num3;
        // 斜辺が整数かどうか判定(doubleとintの差分が0かどうかで判定する)
        if (num3 - (double) num4 == 0.0) {
          cnt++;
        }
      }
    }
    System.out.println(cnt);
  }
}