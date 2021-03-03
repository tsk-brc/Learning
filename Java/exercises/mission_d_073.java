import java.util.*;

/*
  文字列を反転する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // 出力する文字列を格納する変数
    StringBuilder sb = new StringBuilder();
    // 文字列を逆から1文字ずつappendする
    for (int i = 0; i < str.length(); i++) {
      sb.insert(0, str.substring(i, i + 1));
    }
    System.out.println(sb);
  }
}