import java.util.*;

/*
  くじが当選したかどうか確認する。ルールは以下の通り。
    ・1から100までの好きな数字を6つ選ぶ。
    ・抽選も同様に6つの当選番号が選ばれ、発表される。
    ・N枚の宝くじについて、 当選番号と一致した数字の数を調査する。
      なお、当選番号及び、くじの番号はランダムに記載され、昇順、降順になるとは限らない。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" ,|\\s");
    // 当選番号を格納する配列
    int num[] = new int[6];
    // 当選番号1
    num[0] = Integer.parseInt(sc.next());
    // 当選番号2
    num[1] = Integer.parseInt(sc.next());
    // 当選番号3
    num[2] = Integer.parseInt(sc.next());
    // 当選番号4
    num[3] = Integer.parseInt(sc.next());
    // 当選番号5
    num[4] = Integer.parseInt(sc.next());
    // 当選番号6
    num[5] = Integer.parseInt(sc.next());
    // くじの枚数
    int card = Integer.parseInt(sc.next());
    // 全てのくじをチェックする
    for (int i = 0; i < card; i++) {
      int equalNum = 0;
      // 当選番号と一致した番号があるかチェック
      for (int j = 0; j < 6; j++) {
        int targetNum = Integer.parseInt(sc.next());
        for (int k = 0; k < 6; k++) {
          if (targetNum == num[k]) {
            // 一致した番号があれば1追加する
            equalNum++;
          }
        }
      }
      System.out.println(equalNum);
    }

  }
}