import java.util.*;

/*
  必要な電球の数を計算する。
  一定の間隔で電飾を施すことにした場合に必要な電飾の数を求める。
  ただし、左端の木には必ず電飾を施すこととする。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 木の本数
    int num1 = Integer.parseInt(sc.next());
    // 電飾を飾る間隔
    int num2 = Integer.parseInt(sc.next());
    // 1本あたりに必要な電球の個数
    int num3 = Integer.parseInt(sc.next());
    // 電飾を飾る木の本数
    int check = 0;
    if (num1 % num2 != 0) {
      check = num1 / num2 + 1;
    } else {
      check = num1 / num2;
    }

    System.out.println(check * num3);
  }
}