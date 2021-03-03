import java.util.*;

/*
  表示可能な文字数までを表示する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 表示可能な文字数
    int num = Integer.parseInt(sc.nextLine());
    // 表示させる文字
    String str = sc.nextLine();
    // 表示可能な文字数まで表示
    System.out.println(str.substring(0, num));
  }
}