import java.util.*;

/*
  IPアドレスかどうかを判定する。
  なお、IPアドレスはIPv4で定義された範囲のIPアドレスとし、書式は以下の通りとする。
    ・.で区切られた10進数の4つの数で表される。
    ・数の範囲は0から255までとする。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 判定するIPアドレスの数
    int num = Integer.parseInt(sc.nextLine());
    // 判定する値
    int checkNum = 0;
    // IPアドレスかどうかを示すフラグ
    boolean checkFlg = true;
    // 判定するIPアドレスの数分ループ
    for (int i = 0; i < num; i++) {
      // 判定するIPアドレス
      String str = sc.nextLine();
      // 「.」区切りで格納する配列
      ArrayList<String> ip4 = new ArrayList<String>();
      // 「.」間を繋ぐ文字列
      StringBuilder sb = new StringBuilder();
      // IPアドレスの文字数分ループ
      for (int j = 0; j < str.length(); j++) {
        // 「.」ならそこまでを1つのエリアとして配列に格納
        if (str.substring(j, j + 1).equals(".")) {
          ip4.add(sb.toString());
          sb.setLength(0);
        } else {
          sb.append(str.substring(j, j + 1));
        }
      }
      // 最後の1文字分の対応
      ip4.add(sb.toString());
      // 配列の数値のチェック
      for (int k = 0; k < ip4.size(); k++) {
        checkFlg = true;
        // 配列のエリアが4でなければIPアドレスではない
        if (ip4.size() != 4) {
          checkFlg = false;
          break;
        }
        // 配列のエリアが空白または3桁未満でなければIPアドレスではない
        if (ip4.get(k).equals("") || ip4.get(k).length() >= 4) {
          checkFlg = false;
          break;
        } else {
          checkNum = Integer.parseInt(ip4.get(k));
          // 0から255の範囲かどうか
          if (checkNum < 0 && checkNum > 255) {
            checkFlg = false;
            break;
          }
        }
      }
      // 結果を出力
      if (checkFlg) {
        System.out.println("True");
      } else {
        System.out.println("False");
      }
    }
  }
}