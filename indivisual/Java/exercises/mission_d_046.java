import java.util.*;

/*
  卵を孵化させるのに必要な距離を求める。
  ただし、卵3つはまとめて持っていくことができる。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 卵1を孵化させるのに必要な距離
    int num1 = Integer.parseInt(sc.next());
    // 卵2を孵化させるのに必要な距離
    int num2 = Integer.parseInt(sc.next());
    // 卵3を孵化させるのに必要な距離
    int num3 = Integer.parseInt(sc.next());
    // 必要な距離を求める(最大の値が全ての卵を孵化させるのに必要な距離)
    if (num1 >= num2 && num1 >= num3) {
      System.out.println(num1);
    } else if (num2 >= num1 && num2 >= num3) {
      System.out.println(num2);
    } else {
      System.out.println(num3);
    }
  }
}