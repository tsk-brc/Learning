import java.util.*;

/*
  割り算の余りを求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 割る数
    int num1 = Integer.parseInt(sc.nextLine());
    // 割られる数
    int num2 = Integer.parseInt(sc.nextLine());
    // あまりを計算
    System.out.println(num1 % num2);
  }
}