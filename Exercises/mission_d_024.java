import java.util.*;

/*
  三角形の内角を求める。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //判明している2つの内角
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        //残りの内閣を求める
        System.out.println(180 - num1 - num2);
    }
}