import java.util.*;

/*
  2数の差分を求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" ,|\\s");
    // 値1
    int num1 = Integer.parseInt(sc.next());
    // 値2
    int num2 = Integer.parseInt(sc.next());
    // 差分を求める
    System.out.println(num1 - num2);
  }
}