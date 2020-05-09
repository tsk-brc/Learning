import java.util.*;

/*
  座標軸上の位置を求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter("　|\\s");
    // 正の方向にどれだけ動くか
    int num1 = Integer.parseInt(sc.next());
    // 負の方向にどれだけ動くか
    int num2 = Integer.parseInt(sc.next());
    // 現在の位置を出力
    System.out.println(num1 - num2);
  }
}