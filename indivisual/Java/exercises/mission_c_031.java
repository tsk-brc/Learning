import java.util.*;

/*
  各国の現在時刻を求める。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //調査対象の国数
        int num = Integer.parseInt(sc.next());
        //国名を格納する配列
        String[] country = new String[num];
        //国名に対応する世界標準時からの時差を格納する配列
        int[] localTime = new int[num];
        //国の数だけループ
        for (int i = 0; i < num; i++){
          //国名
          country[i] = sc.next();
          //世界標準時からの時差
          localTime[i] = Integer.parseInt(sc.next());
        }
        //基準となる国名
        String targetCountry = sc.next();
        //基準となる国の現在の時間
        String targetTime = sc.next();
        //基準となる国の世界標準時からの時差
        int targetTimeNum = 0;
        //基準となる国の現在の「時」
        int h = Integer.parseInt(targetTime.substring(0,2));
        //基準となる国の現在の「分」
        String m = targetTime.substring(3,5);
        //基準となる国名の時差を取得
        for(int j = 0; j < num; j++){
          if(targetCountry.equals(country[j])){
            targetTimeNum = localTime[j];
            break;
          }
        }
        //各国の現在の時刻を算出
        for(int k = 0; k < num; k++){
          //基準となる国との時差
          int finalTime = localTime[k] - targetTimeNum;
          //対象の国の現在の「時」
          int outputHour = h + finalTime;
          //24時間表記に変更
          if(outputHour < 0){
             outputHour += 24;  
          } else if(outputHour > 23) {
             outputHour -= 24; 
          }
          //前0付きで出力
          System.out.println(String.format("%02d",outputHour) + ":" + m);    
        }
        
    }
}
