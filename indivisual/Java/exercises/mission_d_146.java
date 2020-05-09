import java.util.*;

/*
  単語の省略形を作成する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // 出力する文字列
    StringBuilder sb = new StringBuilder();
    // 全ての文字をチェック
    for (int i = 0; i < str.length(); i++) {
      // a,i,u,e,oのいずれかなら省略
      if (str.substring(i, i + 1).equals("a") || str.substring(i, i + 1).equals("i")
          || str.substring(i, i + 1).equals("u") || str.substring(i, i + 1).equals("e")
          || str.substring(i, i + 1).equals("o")) {
        // a,i,u,e,o以外なら文字列を結合
      } else {
        sb.append(str.substring(i, i + 1));
      }
    }
    System.out.println(sb);
  }
}