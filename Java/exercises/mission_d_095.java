import java.util.*;

/*
  割り算の商を求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 値1
    int num1 = Integer.parseInt(sc.nextLine());
    // 値2
    int num2 = Integer.parseInt(sc.nextLine());
    // 除算の結果
    System.out.println(num1 / num2);
  }
}