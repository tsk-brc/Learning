import java.util.*;

/*
  足してゼロになる数を求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.nextLine());
    // 足してゼロになる値(絶対値が同じで符号の違う値)を出力
    System.out.println(num * (-1));
  }
}