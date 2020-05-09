import java.util.*;

/*
  箱の向きを揃えるための回転数を求める。
  箱の揃える向きは一通りに定められており、この向きに揃える必要がある。
  ただ、向きを揃えるのに右回りにしか回転させることができない。
  1側面分の回転を1回として、箱の向きが揃う最小回転数を計算する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" ,|\\s");
    // 箱の側面の数
    int charLength = Integer.parseInt(sc.next());
    // 完成形の箱の側面を表す文字列
    String str1 = sc.next();
    // 初期の箱の側面を表す文字列
    String str2 = sc.next();
    // 回転させた回数
    int moveCount = 0;
    for (int i = 0; i < charLength; i++) {
      // 向きが一致したら処理終了
      if (str1.equals(str2)) {
        break;
      } else {
        // 回転後の箱の側面を表す変数
        StringBuilder sb = new StringBuilder();
        // 末尾に追加する文字
        String lastChar = new String();
        // 回転数を1追加する
        moveCount++;
        for (int j = 0; j < charLength; j++) {
          if (j == 0) {
            // 回転前に先頭だった文字は末尾に追加するため一旦退避させる
            lastChar = str2.substring(j, j + 1);
          } else {
            // 先頭文字以外はそのまま追加する
            sb.append(str2.substring(j, j + 1));
          }
        }
        // 末尾に先頭だった文字を追加する
        sb.append(lastChar);
        // 比較のため型変換を行う
        str2 = new String(sb);
      }
    }
    System.out.println(moveCount);
  }
}
