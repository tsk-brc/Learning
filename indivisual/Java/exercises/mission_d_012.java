import java.util.*;

/*
  絶対値を求める。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        //絶対値を求める
        if(num >= 0){
          System.out.println(num);
        } else {
          System.out.println(-num);  
        }
    }
}