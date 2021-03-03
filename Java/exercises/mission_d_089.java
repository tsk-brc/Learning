import java.util.*;

/*
  文字列から数字のみを取り出す。
  文字列は数字が0以上の整数値と1文字以上の半角アルファベットで構成される。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // 数字以外を置換
    int num = Integer.parseInt(str.replaceAll("[^0-9]", ""));
    // 結果を出力
    System.out.println(num);
  }
}