import java.util.*;

/*
  半分にした時の値がいくつかを求める。ただし、小数点以下は切り捨てるものとする。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //半分にする値
        int num = Integer.parseInt(sc.nextLine());
        System.out.println(num / 2);
    }
}