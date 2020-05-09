import java.util.*;

/*
  奇数か偶数かを判定する。
*/
public class Main {
    public static void main(String[] args) {

        // 入力データを受け取る
        Scanner sc = new Scanner(System.in);
        // 対象の整数
        int num = Integer.parseInt(sc.nextLine());
        // 奇数か偶数か判定する
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}