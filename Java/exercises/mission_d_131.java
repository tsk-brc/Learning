import java.util.*;
/*
  数値を対応する文字に置換する。
   A → 1
   B → 2
   C → 0 
*/

public class Main {
    public static void main(String[] args) {

        // 入力データを受け取る
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // 「1」を「A」に置換
        String str1 = str.replaceAll("1", "A");
        // 「2」を「B」に置換
        String str2 = str1.replaceAll("2", "B");
        // 「0」を「C」に置換
        String str0 = str2.replaceAll("0", "C");
        // 結果を出力
        System.out.println(str0);
    }
}