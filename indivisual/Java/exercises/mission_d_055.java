import java.util.*;

/*
  ある商品のキャッチコピーを作成する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // 出力する文字列を格納する変数
    StringBuilder sb = new StringBuilder();
    // 文字列を追加
    sb.append("Best in ");
    sb.append(str);
    // キャッチコピーを出力
    System.out.println(sb);
  }
}