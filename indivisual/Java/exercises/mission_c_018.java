import java.util.*;

/*
  何人前の料理を作れるかをチェックする。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //レシピに必要な食材数
        int receipeFoodNum = Integer.parseInt(sc.next());
        //レシピの情報を格納する配列
        String[][] useFood = new String[receipeFoodNum][2];
        //完成した料理数(人前)
        int makeDishes = 10000;
        //レシピ情報を格納
        for(int i = 0; i < receipeFoodNum; i++){
          //材料
          String food = sc.next();
          //必要な量
          String receipeFood = sc.next();
          //配列に格納
          useFood[i][0] = food;
          useFood[i][1] = receipeFood;
        }
        //手持ちの食材数
        int haveNum = Integer.parseInt(sc.next());
        //手持ちの食材の情報を格納する配列
        String[][] haveFood = new String[haveNum][2];
        //手持ちの食材の情報を格納
        for(int j = 0; j < haveNum; j++){
          //材料
          String food2 = sc.next();
          //保持している量
          String totalFood = sc.next();
          //配列に格納
          haveFood[j][0] = food2;
          haveFood[j][1] = totalFood;
        }
        //レシピに必要な食材の数だけループ
        for(int k = 0; k < receipeFoodNum; k++){
          //レシピに必要な材料を持っているか
          boolean matchFlg = false;
          //手持ちの材料を確認
          for(int l = 0; l < haveNum; l++){
            //レシピの材料を持っていれば何人前つくれるか算出
            if(haveFood[l][0].equals(useFood[k][0])){
              matchFlg = true;
              if(Integer.parseInt(haveFood[l][1]) / Integer.parseInt(useFood[k][1]) < makeDishes){
                makeDishes = Integer.parseInt(haveFood[l][1]) / Integer.parseInt(useFood[k][1]);
              }
              break;
            }
          }
          //レシピの材料を持っていなければ作れないので処理終了
          if(!matchFlg){
            makeDishes = 0;
            break;
          }
        }
        System.out.println(makeDishes);
    }
}