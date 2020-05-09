import java.util.*;

/*
  ある正の整数の掛け算の結果を出力する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 対象の数字
    int num = Integer.parseInt(sc.nextLine());
    // 出力結果を格納する変数
    StringBuilder sb = new StringBuilder();
    // 掛け算を行い、半角スペース区切りで連結する
    for (int i = 1; i < 10; i++) {
      sb.append(num * i);
      if (i < 9) {
        sb.append(" ");
      }
    }
    System.out.println(sb);
  }
}