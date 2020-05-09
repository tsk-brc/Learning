import java.util.*;

/*
  文字列の前後に文字を追加する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //追加される文字列
        String str1 = sc.nextLine();
        //追加する文字列
        String str2 = sc.nextLine();
        System.out.println(str2 + str1 + str2);
    }
}