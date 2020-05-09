import java.util.*;

/*
  3つの数の掛け算を行う。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ,|\\s");
        //数1
        int num1 = Integer.parseInt(sc.next());
        //数2
        int num2 = Integer.parseInt(sc.next());
        //数3
        int num3 = Integer.parseInt(sc.next());
        //乗算
        System.out.println(num1 * num2 * num3);
    }
}