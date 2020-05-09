import java.util.*;

/*
  持っている本が本棚に収まるかを求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 持っている本の幅
    int num1 = Integer.parseInt(sc.next());
    // 本棚の幅
    int num2 = Integer.parseInt(sc.next());
    // 本棚の段数
    int num3 = Integer.parseInt(sc.next());
    // 本棚に収まるか判定
    if (num1 <= num2 * num3) {
      System.out.println("OK");
    } else {
      System.out.println("NG");
    }
  }
}