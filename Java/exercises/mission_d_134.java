import java.util.*;

/*
  文字列を10文字単位で改行する。
  なお、文字列は1文字以上20文字未満とする。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // 文字列を10文字単位で出力
    if (str.length() > 10) {
      System.out.println(str.substring(0, 10));
      System.out.println(str.substring(10, str.length()));
    } else {
      System.out.println(str);
    }
  }
}