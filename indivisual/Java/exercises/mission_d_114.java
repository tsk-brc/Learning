import java.util.*;

/*
  税込価格を計算する。ただし、小数点以下は切り捨てるものとする。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ,|\\s");
        //消費税(%)
        int num1 = Integer.parseInt(sc.next());
        //税抜き価格
        int num2 = Integer.parseInt(sc.next());
        //double型に型変換
        double persent = (double) num1;
        //小数点以下切り捨てで価格を計算
        int price = (int) (num2 * (1 + (persent /100)));
        System.out.println(price);
    }
}