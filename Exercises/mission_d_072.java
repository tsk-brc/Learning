import java.util.*;

/*
  バックアップ用SSDを購入する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //バックアップするデータ容量
        int backupData = Integer.parseInt(sc.next());
        //HDDの容量
        int dataSize = Integer.parseInt(sc.next());
        //HDDの値段
        int money = Integer.parseInt(sc.next());
        //購入すべきHDDの値段を算出
        if(backupData % dataSize == 0){
          System.out.println(backupData / dataSize * money);    
        } else {
          System.out.println((backupData / dataSize + 1) * money);   
        }
        
    }
}