import java.util.*;

/*
  割引後の金額を求める。
  割引は100円未満の部分を割引するものとする。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 割引前の価格
    int num = Integer.parseInt(sc.nextLine());
    // 割引後の価格を出力
    System.out.println(num - num % 100);
  }
}