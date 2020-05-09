import java.util.*;

/*
  数字をアルファベットに変換する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.nextLine());
    // 数字をアルファベットに変換する
    switch (num) {
      case 5:
        System.out.println("A");
        break;
      case 4:
        System.out.println("B");
        break;
      case 3:
        System.out.println("C");
        break;
      case 2:
        System.out.println("D");
        break;
      case 1:
        System.out.println("E");
        break;
    }
  }
}