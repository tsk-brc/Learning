import java.util.*;

/*
  文字を結合する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 結合する文字数
    int count = Integer.parseInt(sc.nextLine());
    // 結合した文字列
    StringBuilder sb = new StringBuilder();
    // 文字数分ループ
    for (int i = 0; i < count; i++) {
      // 結合する文字
      String str = sc.nextLine();
      sb.append(str);
    }
    System.out.println(sb);
  }
}