import java.util.*;

/*
  試験の点数を算出する。
  試験は2つの科目からなり、試験1で一定以上の点数を取らないと足切りとなり、
  試験2の点数は0点として採点される。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 試験1の得点
    int num1 = Integer.parseInt(sc.next());
    // 試験2の得点
    int num2 = Integer.parseInt(sc.next());
    // 試験1の足切りの点数
    int num3 = Integer.parseInt(sc.next());
    // 試験の点を算出
    if (num1 < num3) {
      System.out.println(num1);
    } else {
      System.out.println(num1 + num2);
    }
  }
}