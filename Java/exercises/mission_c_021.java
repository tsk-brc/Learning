import java.util.*;

/*
  台風の影響を受けるかどうかを判定する。
  台風を、中心は同じだが半径は異なる2つの円でモデル化する。
  2つの円に囲まれた範囲にいる場合、暴風域内にいると考え、
  台風の影響を受けるかどうか判定する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 中心のx座標
    int x = Integer.parseInt(sc.next());
    // 中心のy座標
    int y = Integer.parseInt(sc.next());
    // 小さい円の半径(これより内側であれば台風の目の中)
    int r1 = Integer.parseInt(sc.next());
    // 大きい円の半径(これより外側であれば台風の暴風域外)
    int r2 = Integer.parseInt(sc.next());
    // 対象の人数
    int person = Integer.parseInt(sc.next());
    // 人数分処理を行う
    for (int i = 0; i < person; i++) {
      // 対象の人がいる位置(x座標)
      int targetX = Integer.parseInt(sc.next());
      // 対象の人がいる位置(y座標)
      int targetY = Integer.parseInt(sc.next());
      // 台風の影響を受けるか判定
      if (r1 * r1 <= (targetX - x) * (targetX - x) + (targetY - y) * (targetY - y)
          && (targetX - x) * (targetX - x) + (targetY - y) * (targetY - y) <= r2 * r2) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }
}