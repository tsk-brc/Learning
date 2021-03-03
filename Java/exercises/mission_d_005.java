import java.util.*;

/*
  等差数列を作成する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 初項
    int num1 = Integer.parseInt(sc.next());
    // 公差
    int num2 = Integer.parseInt(sc.next());
    // 出力結果を格納する変数
    StringBuilder sb = new StringBuilder();
    // 10回分の数列の結果を計算する
    for (int i = 0; i < 10; i++) {
      sb.append(num1 + num2 * i);
      if (i != 9) {
        sb.append(" ");
      }
    }
    System.out.println(sb);
  }
}