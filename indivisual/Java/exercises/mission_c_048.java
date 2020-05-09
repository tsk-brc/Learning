import java.util.*;

/*
  タダで注文できるまでの料金を計算する。
  あるコーヒーショップでは、コーヒーの値段を以下のルールで値下げをしている。
    ・コーヒーを買った際に、次のお買い上げの値段を更にP% off。
    ・毎回の値下げにおいて小数点以下は切り捨て。
  上記のルールを繰り返し、タダでコーヒーが飲めるまでに支払う料金を求める。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ,|\\s");
        //コーヒーの価格
        int num1 = Integer.parseInt(sc.next());
        //割引率
        int num2 = Integer.parseInt(sc.next());
        //支払った価格
        int totalPrice =  num1;
        //現在のコーヒーの価格
        int objectPrice =  num1;
        //小数点計算するため型変換
        double targetPrice = (double) num2;
        //値段が0円になるまでループ
        while(objectPrice > 0){
            //割引率をパーセント表記
            targetPrice = ((100 - num2) * 0.01);
            //割引率に合わせて現在のコーヒーの価格を変更
            objectPrice *= targetPrice;
            //支払った料金を加算
            totalPrice += objectPrice;
        }
        System.out.println(totalPrice);
    }
}