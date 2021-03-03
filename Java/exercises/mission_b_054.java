import java.util.*;

/*
  足し算を行う。ただし、以下のルールで行う。
    ・足し算は"A","B","C","D","E"からなる文字列で行う。
    ・"A"が0"、"B"が1、"C"が2、"D"が3、"E"が4を表す5進数である。
    ・0以外の数字を表す際に、先頭に"A"が表記されることはない。
*/
public class Main {
    public static void main(String[] args) {

        // 入力データを受け取る
        Scanner sc = new Scanner(System.in);
        // 値1
        String str1 = sc.next();
        // 値2
        String str2 = sc.next();
        // 文字列をルールに沿って置換
        str1 = str1.replaceAll("A", "0");
        str1 = str1.replaceAll("B", "1");
        str1 = str1.replaceAll("C", "2");
        str1 = str1.replaceAll("D", "3");
        str1 = str1.replaceAll("E", "4");
        str2 = str2.replaceAll("A", "0");
        str2 = str2.replaceAll("B", "1");
        str2 = str2.replaceAll("C", "2");
        str2 = str2.replaceAll("D", "3");
        str2 = str2.replaceAll("E", "4");
        // 5進数を10進数に変換
        int num1 = Integer.parseInt(str1, 5);
        int num2 = Integer.parseInt(str2, 5);
        // 足し算を行う
        int sum = num1 + num2;
        // 10進数を5進数に変換
        String s_5 = Integer.toString(sum, 5);
        // 数字をルールに沿って置換
        s_5 = s_5.replaceAll("0", "A");
        s_5 = s_5.replaceAll("1", "B");
        s_5 = s_5.replaceAll("2", "C");
        s_5 = s_5.replaceAll("3", "D");
        s_5 = s_5.replaceAll("4", "E");
        // 結果を出力
        System.out.println(s_5);
    }
}