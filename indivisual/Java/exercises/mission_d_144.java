import java.util.*;

/*
  5桁の2進数を10進数に変換する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // 5桁目
    int num1 = Integer.parseInt(str.substring(0, 1)) * 16;
    // 4桁目
    int num2 = Integer.parseInt(str.substring(1, 2)) * 8;
    // 3桁目
    int num3 = Integer.parseInt(str.substring(2, 3)) * 4;
    // 2桁目
    int num4 = Integer.parseInt(str.substring(3, 4)) * 2;
    // 1桁目
    int num5 = Integer.parseInt(str.substring(4, 5)) * 1;
    // 各桁の結果を加算する
    System.out.println(num1 + num2 + num3 + num4 + num5);
  }
}