import java.util.*;

/*
  レシートからポイントカードに貯まっているポイント数を計算する。
  なお、ポイントは以下のルールで付与される。
    ・通常は購入金額の1％(小数点以下切り捨て)
    ・3のつく日は購入金額の3％(小数点以下切り捨て)
    ・5のつく日は購入金額の5％(小数点以下切り捨て)
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // レシートの枚数
    int receipt = Integer.parseInt(sc.next());
    // 初期のポイント数(デフォルトは0)
    int point = 0;
    // レシート分処理
    for (int i = 0; i < receipt; i++) {
      // 購入日
      int buyDate = Integer.parseInt(sc.next());
      // 購入金額
      int buyMoney = Integer.parseInt(sc.next());
      // 3のつく日は3%付与
      if (buyDate == 3 || buyDate == 13 || buyDate == 23 || buyDate == 30 || buyDate == 31) {
        point += buyMoney * 0.03;
        // 5のつく日は5%付与
      } else if (buyDate == 5 || buyDate == 15 || buyDate == 25) {
        point += buyMoney * 0.05;
        // 上記以外は1%付与
      } else {
        point += buyMoney * 0.01;
      }
    }
    System.out.println(point);
  }
}