import java.util.*;

/*
  ある数字が何桁かを求める。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //数字を文字列として受け取る
        String str = sc.nextLine();
        //文字列の長さを取得
        int strLen = str.length();
        System.out.println(strLen);
    }
}