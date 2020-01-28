import java.util.*;

/*
  和暦を西暦に変換する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //和暦の名前(S or H)
        String str = sc.nextLine();
        //和暦の年
        int year = Integer.parseInt(sc.nextLine());
        //西暦に変換(昭和元年:1926年,平成元年:1989年)
        if(str.equals("S")){
          System.out.println(1925 + year);
        } else {
          System.out.println(1988 + year);
        }
        
    }
}