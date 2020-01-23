import java.util.*;

/*
  2つの文字列が同じかどうかを比較する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //文字列を受け取る
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        //2つの文字列が一致していているか判定する
        if(str1.equals(str2)){
          System.out.println("Yes");    
        } else {
          System.out.println("No");
        }
    }
}