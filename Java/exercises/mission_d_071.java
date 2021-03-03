import java.util.*;

/*
  洗濯物を外に干すかどうかを判断する。外に干す条件は以下の通り。
    ・気温が25度以上の日、もしくは湿度が40%以下の日は外に干す。
    ・ただし、上記の条件を満たす日のうち、
      気温が25度以上かつ、湿度40%以下の日は砂ぼこりが舞うので干さない。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 気温
    int num1 = Integer.parseInt(sc.next());
    // 湿度
    int num2 = Integer.parseInt(sc.next());
    // 外に干すか判定
    if (num1 >= 25 || num2 <= 40) {
      if (num1 >= 25 && num2 <= 40) {
        System.out.println("No");
      } else {
        System.out.println("Yes");
      }
    } else {
      System.out.println("No");
    }
  }
}