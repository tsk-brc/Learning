import java.util.*;

/*
  書籍購入費のランキングを作成する。
  ただし、書籍購入費が同一の人物は存在しないものとする。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 調査対象の人数
    int person = Integer.parseInt(sc.nextLine());
    // 名前の配列
    String[] nameList = new String[person];
    // 名前に対応する購入金額の配列
    int[] moneyList = new int[person];
    // 名前をリストに格納
    for (int i = 0; i < person; i++) {
      nameList[i] = sc.next();
    }
    // 購入した書籍数
    int book = Integer.parseInt(sc.next());
    // 書籍数分ループ
    for (int j = 0; j < book; j++) {
      // 購入した人物
      String buyPerson = sc.next();
      // 購入した金額
      int money = Integer.parseInt(sc.next());
      // 名前の配列に対応する番号の購入金額の配列に購入金額を加算
      for (int k = 0; k < person; k++) {
        if (buyPerson.equals(nameList[k])) {
          moneyList[k] += money;
          break;
        }
      }
    }
    // 直近の最高値
    int reMaxMoney = 0;
    // 人数分ループ
    for (int l = 0; l < person; l++) {
      // 残った人の中で最大の購入者
      String maxPerson = new String();
      // 残った人の中で最大の購入金額
      int maxMoney = 0;
      // 人数分ループ
      for (int m = 0; m < person; m++) {
        // ループ1回目はそのまま比較
        if (reMaxMoney == 0) {
          if (maxMoney < moneyList[m]) {
            maxPerson = nameList[m];
            maxMoney = moneyList[m];
          }
          // 2回目以降は残った人の中から最高値を算出する(既に選ばれた人は比較対象から除外する)
        } else {
          if (maxMoney <= moneyList[m] && moneyList[m] < reMaxMoney) {
            maxPerson = nameList[m];
            maxMoney = moneyList[m];
          }
        }
      }
      // 今回の最高値(この金額以上の人は前回の比較対象から外れる)
      reMaxMoney = maxMoney;
      System.out.println(maxPerson);
    }
  }
}