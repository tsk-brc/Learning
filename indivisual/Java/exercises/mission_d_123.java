import java.util.*;

/*
  電子マネーのオートチャージを行う。
  残高が10,000円を切っていると自動で10,000円をチャージする。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //残高
        int num = Integer.parseInt(sc.nextLine());
        //チャージ後の残高
        if(num < 10000){
          System.out.println(num + 10000);
        } else {
          System.out.println(num);  
        }
    }
}