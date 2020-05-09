import java.util.*;

/*
  割り算の商と剰余を求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 被除数
    int num1 = Integer.parseInt(sc.next());
    // 除数
    int num2 = Integer.parseInt(sc.next());
    // 結果を出力
    System.out.println(num1 / num2 + " " + num1 % num2);
  }
}