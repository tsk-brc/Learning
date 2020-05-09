import java.util.*;

/*
  仕入れた量に対して売れ残った量を算出する。
  生鮮食品をm[kg]仕入れた。
  最初は生のまま販売したところ、p[%]を売ることができた。
  次にその売れ残りをすべてお惣菜にして販売したところ、q[%]を売ることができた。
  最終的に何kg売れ残ったか。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 生鮮食品の量
    int num1 = Integer.parseInt(sc.next());
    // 生のまま売れた量
    int num2 = Integer.parseInt(sc.next());
    // お惣菜にして売れた量
    int num3 = Integer.parseInt(sc.next());
    System.out.println((num1 * (100 - num2) * 0.01) * (100 - num3) * 0.01);
  }
}