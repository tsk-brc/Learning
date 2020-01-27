import java.util.*;

/*
  総和の下1桁のみを出力する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ,|\\s");
        //総和
        int total = 0;
        //値5個分ループ
        for(int i = 0; i < 5; i++){
          //加算する値を受け取る
          int num = Integer.parseInt(sc.next());
          //値を加算
          total += num;
        }
        //文字列に型変換
        String str = Integer.toString(total);
        //下1桁を取り出す
        System.out.println(str.substring(str.length() -1));
    }
}