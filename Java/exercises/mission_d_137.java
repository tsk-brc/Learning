import java.util.*;

/*
  要求が承諾された回数を算出する。
*/
public class Main {
    public static void main(String[] args) {

        // 入力データを受け取る
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // 要求が承諾された回数
        int num = 0;
        // 10回要求する
        for (int i = 0; i < 10; i++) {
            // 承諾されたかどうか(y or n)
            if (str.substring(i, i + 1).equals("y")) {
                num++;
            }
        }
        System.out.println(num);
    }
}