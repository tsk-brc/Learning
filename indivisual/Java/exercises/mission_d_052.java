import java.util.*;

/*
  ピラミッドを行うのに必要な人数を求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // ピラミッドの段数
    int num = Integer.parseInt(sc.nextLine());
    // 必要な人数
    int person = 0;
    // 必要な人数を段数分加算
    for (int i = 0; i < num; i++) {
      person += (i + 1);
    }
    System.out.println(person);
  }
}