import java.util.*;

/*
  完全数かどうか判定する。
  Nを2以上の整数とし、Nの約数のうちN自身を除いたものの総和をSとする。
  このとき、
    N=SならばNは「完全数」、|N-S|=1ならばNは「ほぼ完全数」と定義する。
  対象データが完全数かどうかを判定し、結果を出力する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 判定する整数の個数
    int count = Integer.parseInt(sc.nextLine());
    // 完全数かどうかの判定を行う
    for (int i = 0; i < count; i++) {
      // 対象データ
      int num = Integer.parseInt(sc.nextLine());
      // 約数の総和
      int total = 0;
      // 対象データの約数かどうかをチェックする
      for (int j = 1; j < num; j++) {
        if (num % j == 0) {
          total += j;
        }
      }
      // 完全数かどうか判定する
      if (total == num) {
        System.out.println("perfect");
      } else if (total - num >= -1 && total - num <= 1) {
        System.out.println("nearly");
      } else {
        System.out.println("neither");
      }
    }
  }
}