import java.util.*;

/*
  入力されるデータを1行にして出力する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //データ数
        int num = Integer.parseInt(sc.nextLine());
        //出力するための文字列を格納する変数
        StringBuilder sb = new StringBuilder();
        //複数データを処理して1行にする
        for(int i = 0; i < num; i++){
          if(i > 0){
              sb.append(" ");
          }
          String str = sc.nextLine();
          sb.append(str);
        }
        System.out.println(sb);
    }
}