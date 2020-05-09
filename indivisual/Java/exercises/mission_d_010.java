import java.util.*;

/*
  メールアドレスを作成する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // ローカル部
    String local = sc.nextLine();
    // メールアドレスを結合するための変数
    StringBuilder sb = new StringBuilder();
    // ローカル部と「@」を結合
    sb.append(local);
    sb.append("@");
    // ドメイン
    String domain = sc.next();
    // ドメインを結合
    sb.append(domain);
    // 結果を出力
    System.out.println(sb);
  }
}