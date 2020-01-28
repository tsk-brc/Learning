import java.util.*;

/*
  入力データ全てを同じ文字列に変更する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //文字列を変更した回数
        int num = 0;
        //入力データ7回分ループ
        for(int i = 0; i < 7; i++){
          //文字列を受け取る
          String str = sc.nextLine();
          //「no」ならば変更する回数を+1する。(「yes」ならば何もしない。)
          if(str.equals("no")){
            num++;
          }
        }
        System.out.println(num);
    }
}