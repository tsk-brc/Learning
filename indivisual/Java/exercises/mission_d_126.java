import java.util.*;

/*
  得点を計算する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //スコア1
        int num1 = Integer.parseInt(sc.next());
        //スコア2
        int num2 = Integer.parseInt(sc.next());
        //スコア3
        int num3 = Integer.parseInt(sc.next());
        //総得点
        System.out.println(num1 + num2 + num3);
    }
}