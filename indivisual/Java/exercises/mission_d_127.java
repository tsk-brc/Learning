import java.util.*;

/*
  数字がゾロ目か判定する。
  ただし、文字列は先頭の大文字アルファベット1文字と続く数字3つからなる。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //判定結果
        boolean checkFlg = true;
        //数字がゾロ目かどうか
        for(int i = 0; i < 2; i++){
          if(str.substring(i + 1, i + 2).equals(str.substring(i + 2, i + 3))){
            checkFlg = true;
          } else {
            checkFlg = false;
            break;
          }
        }
        //結果を出力
        if(checkFlg){
          System.out.println("Yes");
        } else {
          System.out.println("No");  
        }
    }
}