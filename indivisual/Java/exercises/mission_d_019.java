import java.util.*;

/*
  指定番目の文字を出力する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //対象文字列
        String str = sc.next();
        //何文字目を出力するか
        int num = Integer.parseInt(sc.next());
        System.out.println(str.substring(num - 1 , num));
    }
}