import java.util.*;

/*
  面積あたりの価格の安い商品を選定する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" ,|\\s");
    // 商品1の縦の長さ
    double tate1 = (double) Integer.parseInt(sc.next());
    // 商品1の横の長さ
    double yoko1 = (double) Integer.parseInt(sc.next());
    // 商品1の価格
    double price1 = (double) Integer.parseInt(sc.next());
    // 商品2の縦の長さ
    double tate2 = (double) Integer.parseInt(sc.next());
    // 商品2の横の長さ
    double yoko2 = (double) Integer.parseInt(sc.next());
    // 商品2の価格
    double price2 = (double) Integer.parseInt(sc.next());
    // 選定した商品の縦の長さ
    int resultTate = 0;
    // 選定した商品の横の長さ
    int resultYoko = 0;
    // 選定した商品の価格
    int resultPrice = 0;
    // 面積あたりの価格の比較
    if (price1 / (tate1 * yoko1) < price2 / (tate2 * yoko2)) {
      resultTate = (int) tate1;
      resultYoko = (int) yoko1;
      resultPrice = (int) price1;
      System.out.println(resultTate + " " + resultYoko + " " + resultPrice);
    } else if (price1 / (tate1 * yoko1) > price2 / (tate2 * yoko2)) {
      resultTate = (int) tate2;
      resultYoko = (int) yoko2;
      resultPrice = (int) price2;
      System.out.println(resultTate + " " + resultYoko + " " + resultPrice);
    } else {
      System.out.println("DRAW");
    }
  }
}