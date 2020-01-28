import java.util.*;

/*
  パスワードとして有効か判定する。
  全ての文字が同じパスワードだった場合にNGとする。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //N番目の文字
        String reString = new String();
        //N+1番目の文字
        String checkString = new String();
        //全ての文字が同じかを判定するフラグ
        Boolean checkFlg = false;
        //文字が全て同じか判定
        for(int i = 0; i < str.length(); i++){
             reString = str.substring(i,i+1);
            if(i > 0){
              if(!reString.equals(checkString)){
                checkFlg = true;  
                break;
              }
            }
            checkString = reString;
        }
        //結果を出力
        if(checkFlg){
          System.out.println("OK");
        } else {
          System.out.println("NG");  
        }
    }
}