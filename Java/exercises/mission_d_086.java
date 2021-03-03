import java.util.*;

/*
  棒を3:5:7の長さに分割する。  
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 最も短い棒の長さ
    int num = Integer.parseInt(sc.nextLine());
    // 棒全体の長さ
    System.out.println(num * 5);
  }
}