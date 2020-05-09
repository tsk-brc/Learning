import java.util.*;

/*
  100になるまでの値を求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // 100との差を求める
    System.out.println(100 - Integer.parseInt(str));
  }
}