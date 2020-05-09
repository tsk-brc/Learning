import java.util.*;

/*
  対象の文字列を含むデータを取り出す。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //文字列の数
        int num = Integer.parseInt(sc.nextLine());
        //抽出対象の文字
        String targetWord = sc.nextLine();
        //抽出した数
        int outputWord = 0;
        //全文字列に対してチェック
        for(int i = 0; i < num; i++){
            //文字列を受け取る
            String str = sc.nextLine();
            //抽出対象の文字が含まれるかチェック
            if(str.contains(targetWord)){
              System.out.println(str);
              outputWord ++;
            }
        }
        //抽出対象がなければ、なかったときの文字列を出力
        if(outputWord == 0){
          System.out.println("None");
        }
    }
}