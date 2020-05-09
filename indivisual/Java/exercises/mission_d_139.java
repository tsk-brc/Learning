import java.util.*;

/*
  じゃんけんを行う。ルールは以下の通り。
    ・じゃんけんでは、グーおよびパーしか出すことができない。
    ・同じ手の人が少なかった手を出した人を勝者とする。
*/

public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 参加人数
    int num = Integer.parseInt(sc.next());
    // グーを出した人数
    int gCount = 0;
    // パーを出した人数
    int pCount = 0;
    // 全員の手をチェック
    for (int i = 0; i < num; i++) {
      String str = sc.next();
      if (str.equals("G")) {
        gCount++;
      } else {
        pCount++;
      }
    }
    // 勝敗を判定
    if (gCount < pCount) {
      System.out.println("G");
    } else if (gCount > pCount) {
      System.out.println("P");
    } else {
      System.out.println("Draw");
    }

  }
}