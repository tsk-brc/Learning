import java.util.*;

/*
  内角の和から何角形か求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 多角形の内角の和
    int num = Integer.parseInt(sc.nextLine());
    // 何角形か
    System.out.println(num / 180 + 2);
  }
}