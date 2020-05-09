import java.util.*;
/*
  Leetspeakを適用する。以下のルールに従って文字列を置換する。
  ・置換前 → 置換後
        A → 4
        E → 3
        G → 6
        I → 1
        O → 0
        S → 5
        Z → 2
*/

public class Main {
    public static void main(String[] args) {

        // 入力データを受け取る
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // 置換ルールを適用する
        String str1 = str.replace("A", "4");
        String str2 = str1.replace("E", "3");
        String str3 = str2.replace("G", "6");
        String str4 = str3.replace("I", "1");
        String str5 = str4.replace("O", "0");
        String str6 = str5.replace("S", "5");
        String str7 = str6.replace("Z", "2");

        // ルール適用後の値を出力する
        System.out.println(str7);
    }
}