import java.util.*;

/*
  以下のフォーマットに合わせて対象の人に挨拶を行う。
  Hello [s_1],[s_2],...[s_n].
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 挨拶する人数
    int cnt = Integer.parseInt(sc.nextLine());
    // 出力する文字列を格納する変数
    StringBuilder sb = new StringBuilder();
    // 挨拶を先頭に追加
    sb.append("Hello ");
    // 人数分処理を行う
    for (int i = 0; i < cnt; i++) {
      // 挨拶する人名を取得
      String person = sc.next();
      // 受け取った人名を追加
      sb.append(person);
      if (i + 1 != cnt) {
        // 区切り文字を追加
        sb.append(",");
      }
    }
    // 最後にピリオドを追加
    sb.append(".");
    // 結果を出力
    System.out.println(sb);
  }
}