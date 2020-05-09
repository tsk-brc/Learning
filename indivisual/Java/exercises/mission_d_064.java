import java.util.*;

/*
  「False」を「True」に書き換える。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // 文字列を置換
    System.out.println(str.replaceAll("False", "True"));
  }
}