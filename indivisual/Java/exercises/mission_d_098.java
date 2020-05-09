import java.util.*;

/*
  掛け算の積を算出する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ,|\\s");
        //値1
        int num1 = Integer.parseInt(sc.next());
        //値2
        int num2 = Integer.parseInt(sc.next());
        //乗算の結果
        System.out.println(num1 * num2);
    }
}