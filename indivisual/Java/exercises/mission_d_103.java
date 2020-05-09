import java.util.*;

/*
  文字列を逆さにする。
*/
public class Main {
    public static void main(String[] args) {

       //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //逆さにした文字列
        StringBuilder sb = new StringBuilder();
        //文字数分ループ
        for(int i = str.length(); i > 0; i--){
          //末尾から文字を追加
          sb.append(str.substring(i - 1, i));  
        }
        System.out.println(sb);
    }
}