import java.util.*;

/*
  全ての数の足し算を行う。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //足す数字の数
        int count = Integer.parseInt(sc.next());
        //数字の総和
        int num = 0;
        //数字の数だけループ
        for(int i = 0; i < count; i++){
          //値を足していく
          num += Integer.parseInt(sc.next());
        }
        System.out.println(num);
    }
}