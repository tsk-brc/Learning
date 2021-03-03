import java.util.*;

/*
  辞書のあるページに載っている単語を調べる。
  辞書に載る各単語は小文字のアルファベットのみで構成されている。
  また、普通の辞書同様に、単語は辞書順で小さいほうから掲載される。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 辞書に載せる単語の数
    int wordNum = Integer.parseInt(sc.next());
    // 1ページに掲載する単語の数
    int perPageNum = Integer.parseInt(sc.next());
    // 調べたいページ番号
    int pageNum = Integer.parseInt(sc.next());
    // 辞書
    String[] dictionary = new String[wordNum];
    // 辞書に単語を追加
    for (int i = 0; i < wordNum; i++) {
      dictionary[i] = sc.next();
    }
    // アルファベット順にソート
    Arrays.sort(dictionary);
    // 調べたいページが最終ページかどうか
    if (perPageNum * pageNum < wordNum) {
      // 1ページに載っている単語数分ループ
      for (int j = perPageNum * (pageNum - 1); j < perPageNum * pageNum; j++) {
        // 該当ページに載っている単語を出力
        System.out.println(dictionary[j]);
      }
    } else {
      // 最終語までループ
      for (int j = perPageNum * (pageNum - 1); j < wordNum; j++) {
        // 該当ページに載っている単語を出力
        System.out.println(dictionary[j]);
      }
    }
  }
}