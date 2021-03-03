import java.util.*;

/*
  「at」を「@」に置換する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // 置換して出力
    System.out.println(str.replaceAll("at", "@"));
  }
}