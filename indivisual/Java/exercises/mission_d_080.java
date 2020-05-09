import java.util.*;

/*
  居酒屋の料金を算出する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" ,|\\s");
    // 飲み放題をつける人数
    int drinker = Integer.parseInt(sc.next());
    // 飲み放題をつけない人数
    int nonDrinker = Integer.parseInt(sc.next());
    // 料金を算出
    System.out.println(drinker * 6000 + nonDrinker * 4000);
  }
}