import java.util.*;

/*
  先頭3文字を出力する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // 先頭3文字を出力
    System.out.println(str.substring(0, 3));
  }
}