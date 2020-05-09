import java.util.*;

/*
  パーティーを開催できるか判定する。
  なお、お菓子が合計11本以上あればパーティーを開催できる。
  お菓子の1本は数字の"1"で表され、本数分だけ"1"が連続する文字列が与えられる。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //お菓子の本数("1"が1文字で1本と数える)
        String str = sc.nextLine();
        //開催できるか判定、開催できなければ残りの必要な本数を出力
        if(str.length() >= 11){
          System.out.println("OK");    
        } else {
          System.out.println(11 - str.length());
        }
    }
}