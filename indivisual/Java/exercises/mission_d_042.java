import java.util.*;

/*
  2次行列の行列式を求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 2次行列の値
    int num1 = Integer.parseInt(sc.next());
    int num2 = Integer.parseInt(sc.next());
    int num3 = Integer.parseInt(sc.next());
    int num4 = Integer.parseInt(sc.next());
    // 行列式を求める
    System.out.println(num1 * num4 - num2 * num3);
  }
}