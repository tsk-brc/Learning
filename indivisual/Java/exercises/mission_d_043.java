import java.util.*;

/*
  今日の天気を求める。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //降水確率
        int num = Integer.parseInt(sc.nextLine());
        //今日の天気
        if(num <= 30){
          System.out.println("sunny");    
        } else if(31 <= num && num <= 70) {
          System.out.println("cloudy");  
        } else {
          System.out.println("rainy");  
        }
        
    }
}