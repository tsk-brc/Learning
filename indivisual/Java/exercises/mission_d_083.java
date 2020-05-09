import java.util.*;

/*
  ブラックジャックで次のカードを引くかどうか判定する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //1枚目に引いたカード
        int num1 = Integer.parseInt(sc.next());
        //2枚目に引いたカード
        int num2 = Integer.parseInt(sc.next());
        //合計が16以下ならもう1枚引く
        if(num1 + num2 < 16){
          System.out.println("HIT");
        } else {
          System.out.println("STAND");
        }
    }
}