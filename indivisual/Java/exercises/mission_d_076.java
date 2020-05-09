import java.util.*;

/*
  禁止ワードが含まれているかどうか判定する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 禁止ワード
    String str1 = sc.nextLine();
    // 調査ワード
    String str2 = sc.nextLine();
    // 禁止ワードが含まれているか
    if (str2.contains(str1)) {
      System.out.println("NG");
    } else {
      System.out.println(str2);
    }
  }
}