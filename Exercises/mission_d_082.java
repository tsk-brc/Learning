import java.util.*;

/*
  しりとりができているかチェックする。なお、ルールは以下の通り。
    ・1人目の最後の1文字が2人目の最初の1文字と一致している。
    ・2人目の最後の1文字がnではない。
    ・同じ単語を使用しても良い。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //1人目の単語
        String str1 = sc.nextLine();
        //2人目の単語
        String str2 = sc.nextLine();
        //しりとりができたか判定
        if(!(str1.substring(str1.length()-1,str1.length()).equals(str2.substring(0,1)))){
          System.out.println("NG");
        } else if (str2.substring(str2.length()-1,str2.length()).equals("n")){
          System.out.println("NG");  
        } else {
            System.out.println("OK");
        }
    }
}