import java.util.*;

/*
  入力されたデータをそのまま出力する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //1回に入力される文字数
        int num1 = Integer.parseInt(sc.next());
        //入力される回数
        int num2 = Integer.parseInt(sc.next());
        //回数分ループ
        for(int i = 0; i < num2; i++){
            //入力値をそのまま出力
            System.out.println(sc.next());
        }
    }
}