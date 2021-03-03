import java.util.*;

/*
  2つの文字列の長さが一致しているか判定する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    // 文字列の長さ比較
    if (str1.length() == str2.length()) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}