import java.util.*;

/*
  2つの西暦の差分が何年か計算する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("　|\\s");
        //西暦1
        int num1 = Integer.parseInt(sc.next());
        //西暦2
        int num2 = Integer.parseInt(sc.next());
        //差分を出力
        System.out.println(num2 - num1);
    }
}