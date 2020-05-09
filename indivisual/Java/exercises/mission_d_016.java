import java.util.*;

/*
  指定された文字数目までを出力する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 指定文字列
    String str = sc.nextLine();
    // 何文字目までを出力するか
    int num = Integer.parseInt(sc.nextLine());
    System.out.println(str.substring(0, num));
  }
}