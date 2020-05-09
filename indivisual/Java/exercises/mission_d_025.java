import java.util.*;

/*
  数字を3桁で表示する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //前0付きで3桁で表示
        String str = String.format("%03d", Integer.parseInt(sc.nextLine()));
        
        System.out.println(str);
    }
}