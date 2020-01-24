import java.util.*;

/*
  名前のイニシャルを取得する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ,|\\s");
        //姓
        String str1 = sc.next();
        //名
        String str2 = sc.next();
        //イニシャルを取得
        System.out.println(str1.substring(0,1) + "." + str2.substring(0,1));
    }
}