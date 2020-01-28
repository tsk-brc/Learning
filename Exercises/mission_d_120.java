import java.util.*;

/*
  購入した鉛筆の本数を求める。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //購入した数(ダース)
        String str = sc.nextLine();
        //購入した数(本)
        System.out.println(12 * Integer.parseInt(str));
    }
}