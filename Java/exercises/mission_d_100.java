import java.util.*;

/*
  区切り文字を統一する。統一ルールは以下の通り。
    ・区切り文字は「_」(アンダースコア)と「-」(ハイフン)のみ。
    ・「_」と「-」のうち数が多い方に統一する。
    ・もし同数の場合は「_」に統一する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // 「_」の数
    int underScore = 0;
    // 「-」の数
    int hyphenCount = 0;
    // 全ての文字を確認
    for (int i = 0; i < str.length(); i++) {
      String targetChar = str.substring(i, i + 1);
      // 区切り文字なら該当する方をカウントアップ
      if (targetChar.equals("-")) {
        hyphenCount++;
      } else if (targetChar.equals("_")) {
        underScore++;
      }
    }
    // どちらの区切り文字が多かったか
    if (underScore >= hyphenCount) {
      str = str.replaceAll("-", "_");
    } else {
      str = str.replaceAll("_", "-");
    }
    // 結果を出力
    System.out.println(str);
  }
}