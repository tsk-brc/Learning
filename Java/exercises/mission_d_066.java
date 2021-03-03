import java.util.*;

/*
  2つの数値の差分を求める。
  ただし、解がマイナスになるには「No」とする。 
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 数値1
    int num1 = Integer.parseInt(sc.next());
    // 数値2
    int num2 = Integer.parseInt(sc.next());
    // 差分を求める
    if (num1 <= num2) {
      System.out.println(num2 - num1);
    } else {
      System.out.println("No");
    }
  }
}