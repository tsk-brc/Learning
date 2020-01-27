import java.util.*;

/*
  略語を生成する。
  略語は単語の頭文字を前から順に並べる形で略したものとする。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //単語数
        int num = Integer.parseInt(sc.next());
        //略語
        StringBuilder sb = new StringBuilder();
        //単語数分ループ
        for(int i = 0; i < num; i++){
          //先頭1文字を略語に追加
          String str = sc.next();
          sb.append(str.substring(0,1));
        }
        
        System.out.println(sb);
    }
}