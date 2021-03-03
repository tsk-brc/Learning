import java.util.*;

/*
  日付を「/」区切りで出力する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 年
    String year = sc.next();
    // 月
    String month = sc.next();
    // 日
    String day = sc.next();
    // スラッシュ区切りで出力
    System.out.println(year + "/" + month + "/" + day);
  }
}