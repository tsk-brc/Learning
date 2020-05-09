import java.util.*;

/*
  横書きの文字を縦書きに変更する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // 文字数分ループ
    for (int i = 0; i < str.length(); i++) {
      // 1文字ずつ出力
      System.out.println(str.substring(i, i + 1));
    }
  }
}