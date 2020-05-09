import java.util.*;

/*
  商品を選んで購入する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 購入したい商品番号
    int num = Integer.parseInt(sc.next());
    // 商品のリスト
    String[] items = new String[num];
    // 商品をリストに格納する
    for (int i = 0; i < num; i++) {
      String str = sc.next();
      items[i] = str;
      // 商品番号と一致したら出力
      if (num - 1 == i) {
        System.out.println(str);
      }
    }
  }
}