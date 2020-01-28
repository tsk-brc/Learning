import java.util.*;

/*
  「時」を「分」に変換する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        //「分」に変換する
        System.out.println(60 * num);
    }
}