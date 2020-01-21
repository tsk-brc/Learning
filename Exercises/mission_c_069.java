import java.util.*;

/*
  4年に1度の祭が何日後に行われるか算出する。ただし暦は以下の通り。
    ・1年は1月から13月までの13ヶ月がある。
    ・偶数月の日数は15日である。
    ・奇数月の日数は13日である。
    ・閏年は存在しない。
    ・祭りは4で割って余りが1になる年に開催される。
  基準日から次の開催日まで何日あるかを算出し、出力する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //基準年
        int year = Integer.parseInt(sc.next());
        //基準月
        int month = Integer.parseInt(sc.next());
        //基準日
        int day = Integer.parseInt(sc.next());
        //開催月
        int festMonth = Integer.parseInt(sc.next());
        //開催日
        int festDay = Integer.parseInt(sc.next());
        int next = 0;
        //開催年の1月1日までの日数を計算
        if(year % 4 == 0) {
          while(month < 14){
            if(month % 2 == 0){
              next += 15 - day + 1;
              month++;
              day = 1;
            } else {
              next += 13 - day + 1;
              month++;
              day = 1;
            }
          }
        } else if(year % 4 == 2) {
           next = (15 * 6 + 13 * 7) * 2;
           while(month < 14){
            if(month % 2 == 0){
              next += 15 - day + 1;
              month++;
              day = 1;
            } else {
              next += 13 - day + 1;
              month++;
              day = 1;
            }
          } 
        } else if(year % 4 == 3) {
          next = 15 * 6+ 13 * 7;
          while(month < 14){
            if(month % 2 == 0){
              next += 15 - day + 1;
              month++;
              day = 1;
            } else {
              next += 13 - day + 1;
              month++;
              day = 1;
            }
          }
        }
        //開催年の1月1日から開催日までの日数を計算
        month = 1;
        while(month < festMonth){
            if(month % 2 == 0){
              next += 15 - day + 1;
              month++;
              day = 1;
            } else {
              next += 13 - day + 1;
              month++;
              day = 1;
            }
        }
        System.out.println(next + festDay - 1);
    }
}