import java.util.*;

/*
  ページネーションを実装する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 検索結果の件数
    int searchResult = Integer.parseInt(sc.next());
    // ページサイズ
    int paging = Integer.parseInt(sc.next());
    // 表示するページ番
    int page = Integer.parseInt(sc.next());
    // 総ページ数
    int totalPage = 0;
    // 現在の検索位置
    int now = 0;
    // 該当ページに載っている検索数
    int pageCount = 1;
    // 出力する文字列
    StringBuilder sb = new StringBuilder();
    // 総ページ数を求める
    if (searchResult % paging != 0) {
      totalPage = searchResult / paging + 1;
    } else {
      totalPage = searchResult / paging;
    }
    // 該当ページに検索結果があるかどうか
    if (totalPage >= page) {
      // 該当ページの先頭
      now = paging * (page - 1) + 1;
      // ページサイズ分または最終行までループ
      while (pageCount <= paging && searchResult >= now) {
        // 1件目以外なら空白を追加
        if (pageCount != 1) {
          sb.append(" ");
        }
        // 文字列を結合
        sb.append(now);
        // 該当の結果のページ行数
        now++;
        // 該当ページにいくつ結果があるか
        pageCount++;
      }
      // 結果を出力
      System.out.println(sb);
      // なければ"none"を出力
    } else {
      System.out.println("none");
    }
  }
}