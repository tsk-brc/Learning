import java.util.*;

/*
  本の残りページを確認する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //本の総ページ数
        int num1 = Integer.parseInt(sc.next());
        //現在のページ
        int num2 = Integer.parseInt(sc.next());
        //残りのページ数
        System.out.println(num1 - num2);
    }
}