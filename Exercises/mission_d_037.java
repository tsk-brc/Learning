import java.util.*;

/*
  ある期間に必要な個数を求める。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //1つあたりの使用期間
        int num1 = Integer.parseInt(sc.nextLine());
        //残りの期間
        int num2 = Integer.parseInt(sc.nextLine());
        //必要な数
        int need = 0;
        //必要な数を求める
        if(num2 % num1 == 0){
          need = num2 / num1;
        } else {
          need = num2 / num1 + 1;
        }
        System.out.println(need);
    }
}