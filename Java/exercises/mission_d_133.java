import java.util.*;

/*
  株の利益を算出する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 元手となる資金
    int num1 = Integer.parseInt(sc.nextLine());
    // 購入時の1単位あたりの株価
    int num2 = Integer.parseInt(sc.nextLine());
    // 売却時の1単位あたりの株価
    int num3 = Integer.parseInt(sc.nextLine());
    // 利益(購入した株数×売却時の株価-元手資金+端数(購入に使わなかった資金))
    System.out.println((num1 / num2) * num3 - num1 + num1 % num2);
  }
}