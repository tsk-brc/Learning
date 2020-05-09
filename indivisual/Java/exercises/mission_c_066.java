import java.util.*;

/*
  金魚すくいをすることにしました。 ルールは以下の通り。
    ・耐久値がxのポイを使用する。
    ・ポイは重量wの金魚をすくったとき耐久値がw減少する。
    ・耐久値が0になった瞬間ポイは壊れる。このときの金魚はすくうことができない。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 金魚の数
    int num = Integer.parseInt(sc.next());
    // ポイの数
    int poy = Integer.parseInt(sc.next());
    // ポイの耐久度
    int strength = Integer.parseInt(sc.next());
    // すくった金魚の数
    int count = 0;
    // 現在のポイの耐久度
    int poyStrength = strength;
    // 壊れたポイの数
    int destroyedPoyCount = 0;
    // 「ポイがある」かつ「金魚がいる」間はループ
    while (destroyedPoyCount < poy && count < num) {
      // 金魚の重量
      int target = Integer.parseInt(sc.next());
      // 対象の金魚をすくったかどうか
      boolean getFlg = false;
      // 「金魚を捕まえていない」かつ「ポイが残っている」間はループ
      while (!getFlg && destroyedPoyCount < poy) {
        // 耐久度の方が大きい
        if (poyStrength > target) {
          // すくった金魚の数を加算
          count++;
          // ポイの耐久度を重量分減算
          poyStrength -= target;
          // 捕まえたことを記す
          getFlg = true;
          // 金魚の重量がポイの耐久度以上
        } else {
          // 新しいポイに変更
          poyStrength = strength;
          // 壊れた数を加算
          destroyedPoyCount++;
        }
      }
    }
    // すくった数を出力
    System.out.println(count);
  }
}