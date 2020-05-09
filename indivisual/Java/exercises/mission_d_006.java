import java.util.*;

/*
  単位の変換を行う。
  「km」,「m」,「cm」を「mm」に変換する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //変換する値
        int num = Integer.parseInt(sc.next());
        //変換する単位
        String str = sc.next();
        //各単位によって値を変換して出力する
        if(str.equals("km")){
          System.out.println(num * 1000 * 1000);    
        } else if(str.equals("m")) {
          System.out.println(num  * 1000);  
        } else {
          System.out.println(num * 10);
        }
    }
}