import java.util.*;

/*
  スイッチのONとOFFを切り替える。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        //スイッチの状態を確認
        if(count % 2 == 0){
          System.out.println("OFF");
        } else {
          System.out.println("ON");
        }
    }
}