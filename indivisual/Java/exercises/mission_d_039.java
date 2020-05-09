import java.util.*;

/*
  三角形が正三角形かどうか求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 辺の長さ
    int num1 = Integer.parseInt(sc.nextLine());
    int num2 = Integer.parseInt(sc.nextLine());
    int num3 = Integer.parseInt(sc.nextLine());
    // 正三角形かどうか判定
    if (num1 == num2 && num1 == num3) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}