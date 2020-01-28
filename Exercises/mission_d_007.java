import java.util.*;

/*
  文字列をつなげて表示する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //文字列を繋げる数
        int num = Integer.parseInt(sc.nextLine());
        StringBuilder sb = new StringBuilder();
        //対象分文字列を結合する
        for(int i = 0; i < num; i++){
          sb.append("*");
        }
        System.out.println(sb);
    }
}