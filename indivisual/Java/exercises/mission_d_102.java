import java.util.*;

/*
  電車の運賃を計算する。電車運賃は以下のルールで決定する。
    ・初乗り運賃100円
    ・1区間ごとに10円ずつ加算
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //乗車した区間
        String str = sc.nextLine();
        //運賃を計算
        System.out.println(100 + (10 * Integer.parseInt(str)));
    }
}