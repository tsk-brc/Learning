import java.util.*;

/*
  カウントダウンを行う。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // カウントダウン開始の数字
    int num = Integer.parseInt(sc.nextLine());
    // カウントダウン
    for (int i = 0; i < num; i++) {
      System.out.println(num - i);
    }
  }
}