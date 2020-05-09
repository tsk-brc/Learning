import java.util.*;

/*
  最大と最小の値を求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 最大の値
    int maxNum = 0;
    // 最小の値
    int minNum = 100;
    // 入力データ5回分ループ
    for (int i = 0; i < 5; i++) {
      // 数字を受け取る
      int num = Integer.parseInt(sc.nextLine());
      // 初回は最大と最小に値をそのまま埋め込む
      if (i == 0) {
        maxNum = num;
        minNum = num;
      }
      // 最大より大きいか、または最小より小さいかを判定する
      if (maxNum <= num) {
        maxNum = num;
      } else if (minNum >= num) {
        minNum = num;
      }
    }
    System.out.println(maxNum);
    System.out.println(minNum);
  }
}