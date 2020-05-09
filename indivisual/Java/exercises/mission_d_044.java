import java.util.*;

/*
  挨拶を行う。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ,|\\s");
        //名前
        String str1 = sc.next();
        //性別(M or F)
        String str2 = sc.next();
        //挨拶を行う
        if(str2.equals("M")){
          System.out.println("Hi, Mr. " + str1);
        } else {
          System.out.println("Hi, Ms. " + str1);  
        }
    }
}