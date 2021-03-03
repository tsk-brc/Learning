import java.util.*;

/*
  サイコロの裏面の値を求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.nextLine());
    // 裏面の値を求める
    System.out.println(7 - num);
  }
}