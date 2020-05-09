import java.util.*;

/*
  半角アルファベットの小文字を大文字に変換する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //小文字を大文字に変換
        System.out.println(str.toUpperCase());
    }
}