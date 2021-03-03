import java.util.*;
import java.math.*;

/*
  福袋を作成する。なお、福袋の作成条件は以下の通り。
    ・福袋に詰める商品の価値の合計は売値の最小価格以上にする。
    ・福袋に入っている商品のうちいずれか1つを取り除いたとき、必ず売値の最小価格未満になるようにする。
*/

public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 売値の最小価格
    int sellValue = Integer.parseInt(sc.next());
    // 選択する商品数
    int items = Integer.parseInt(sc.next());
    // 各商品の価格を入れる配列
    int[] itemsValue = new int[items];
    // 売却可能かどうかを判定するための変数
    int valiableSell = 0;
    // 商品数分ループ
    for (int i = 0; i < items; i++) {
      // 各商品の価格
      itemsValue[i] = Integer.parseInt(sc.next());
    }
    // 商品を入れるパターンの組み合わせ分チェック
    for (int j = 1; j < Math.pow(2, items); j++) {
      // 2進数表記
      String val2 = Integer.toBinaryString(j);
      // 袋に入れる合計価格
      int totalValue = 0;
      // 袋に入れた商品の最小の価格
      int minValue = 100;
      // 2進数の文字列分チェック
      for (int k = 0; k < val2.length(); k++) {
        // 2進数表記した時、その桁が1かどうか(1:袋に入れる、0:袋に入れない)
        if (val2.substring(val2.length() - k - 1, val2.length() - k).equals("1")) {
          // 合計価格に加算
          totalValue += itemsValue[items - k - 1];
          // 最小値を置き換え
          if (itemsValue[items - k - 1] < minValue) {
            minValue = itemsValue[items - k - 1];
          }
        }
      }
      // 条件に合致するか
      if (totalValue >= sellValue && totalValue - minValue < sellValue) {
        valiableSell++;
      }
    }
    // 合致する組み合わせ数を出力
    System.out.println(valiableSell);
  }
}