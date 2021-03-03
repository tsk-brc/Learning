import java.util.*;

/*
  英語を複数形に変換する。なお、変換ルールは以下の通り。
  ・末尾が s, sh, ch, o, x のいずれかの場合、英単語の末尾に「es」を付ける。
  ・末尾が f, fe のいずれかの場合、英単語の末尾の「f」,「fe」を除き、末尾に「ves」を付ける。
  ・末尾の1文字が y で、末尾から2文字目が a, i, u, e, o のいずれでもない英単語の場合、末尾の「y」を除き、末尾に「ies」を付ける
  ・上記のいずれの条件にも当てはまらない英単語の末尾には「s」を付ける
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.nextLine());
    // 入力データ分処理
    for (int i = 0; i < num; i++) {
      String str = sc.nextLine();
      // 文字列チェック
      if (str.substring(str.length() - 1, str.length()).equals("s")
          || str.substring(str.length() - 1, str.length()).equals("o")
          || str.substring(str.length() - 1, str.length()).equals("x")
          || str.substring(str.length() - 2, str.length()).equals("sh")
          || str.substring(str.length() - 2, str.length()).equals("ch")) {
        System.out.println(str + "es");
      } else if (str.substring(str.length() - 1, str.length()).equals("f")) {
        System.out.println(str.substring(0, str.length() - 1) + "ves");
      } else if (str.substring(str.length() - 2, str.length()).equals("fe")) {
        System.out.println(str.substring(0, str.length() - 2) + "ves");
      } else if (str.substring(str.length() - 1, str.length()).equals("y")) {
        if (!(str.substring(str.length() - 2, str.length() - 1).equals("a")
            || str.substring(str.length() - 2, str.length() - 1).equals("i")
            || str.substring(str.length() - 2, str.length() - 1).equals("u")
            || str.substring(str.length() - 2, str.length() - 1).equals("e")
            || str.substring(str.length() - 2, str.length() - 1).equals("o"))) {
          System.out.println(str.substring(0, str.length() - 1) + "ies");
        } else {
          System.out.println(str + "s");
        }
      } else {
        System.out.println(str + "s");
      }
    }
  }
}
