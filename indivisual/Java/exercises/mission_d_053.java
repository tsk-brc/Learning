import java.util.*;

/*
  子供にお菓子をあげる。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 子供にあげるお菓子の種類
    String str = sc.nextLine();
    // 好きなものかどうか判定
    if (str.equals("chocolate") || str.equals("candy")) {
      System.out.println("Thanks!");
    } else {
      System.out.println("No!");
    }
  }
}