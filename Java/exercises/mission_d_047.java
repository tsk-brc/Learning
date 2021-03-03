import java.util.*;

/*
  選手にメダルを贈呈する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 出力する文字列
    StringBuilder sb = new StringBuilder();
    // 金メダル
    String str = sc.nextLine();
    sb.append("Gold ");
    sb.append(str);
    sb.append("\r\n");
    // 銀メダル
    str = sc.next();
    sb.append("Silver ");
    sb.append(str);
    sb.append("\r\n");
    // 銅メダル
    str = sc.next();
    sb.append("Bronze ");
    sb.append(str);
    System.out.println(sb);
  }
}