import java.util.*;

/*
  お菓子を容器に詰め、余りが最小になる機械を選定する。
  M種類の機械があり、各機械はN個の容器に均等に分配し、余りを排出する。
  排出される余りが最も少なくなる機械を選びたい。
  ただし、同じ余りを排出する機械が複数あった場合には、分配される容器の総数が最も多くなる機械を優先する。
*/
public class Main {
    public static void main(String[] args) {
        
        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //機械の総数
        int machineNum = Integer.parseInt(sc.next());
        //お菓子の個数
        int snackNum = Integer.parseInt(sc.next());
        //商
        int sho = 0;
        //剰余
        int amari = 0;
        //容器の数
        int pack = 0;
		//容器から余ったの個数
        int perNum = 1000;
        //対象の機械
        int targetMachine = 0;
        //全機械でチェックする
        for(int i = 0; i < machineNum; i++){
          //機械が分配する容器の数
          int num = Integer.parseInt(sc.next());
          //今までの機械の中で余りが最小か
          if(snackNum % num < perNum){
            perNum = snackNum % num;
            pack = num;
            targetMachine = i + 1;
          //余りが同じ場合は容器の数が大きいか
          } else if(snackNum % num == perNum && pack <= num){
              pack = num;
              targetMachine = i + 1;
          }
        }
        System.out.println(targetMachine);
    }
}