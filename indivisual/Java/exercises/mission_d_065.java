import java.util.*;

/*
  エラーコードを分類する。
    ・百の位が2であればok
    ・百の位が4であればerror
    ・それ以外全ての数字はunknown
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //エラーコードを分類
        if(str.substring(0,1).equals("2")){
          System.out.println("ok");
        } else if(str.substring(0,1).equals("4")){
          System.out.println("error");
        } else {
          System.out.println("unknown");  
        }
    }
}