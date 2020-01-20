import java.util.*;

/*
  選挙を行い、最も支持者の多い人を出力する。なお、有権者は以下のルールで支持する人を変更していく。
  ・はじめは、すべての有権者はどの立候補者も支持していない。
  ・立候補者が演説をし、演説が終わるたびに、
    「他のそれぞれの立候補者の支持者から1人ずつ」および
	「誰も支持していない有権者から1人」が演説をした人を支持するようになる。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        int rikkouhosha = Integer.parseInt(sc.next());
        int yukensha = Integer.parseInt(sc.next());
        int enzetsu = Integer.parseInt(sc.next());
        int[] person = new int[rikkouhosha + 1];
        int maxPerson = 0;
        ArrayList<Integer> output = new ArrayList<Integer>();
		//立候補者が演説を行う
        for(int i = 0; i < enzetsu; i++){
          int target = Integer.parseInt(sc.next());
          //誰も支持していない有権者がいたら1人追加
          if(i < yukensha){
            person[target] = person[target] + 1;
          }
          for(int j = 1; j <= rikkouhosha; j++){
            if(person[j] > 0 && j != target){
              person[target] = person[target] + 1;
              person[j] = person[j] - 1;
            }
          }
        }
        //最大値の立候補者をリストに追加
        for(int k = 1; k <= rikkouhosha; k++){
          if(person[k] > maxPerson){
            //リストをクリアして最大のみをaddする
            output.clear();
            output.add(k);
            maxPerson = person[k];
          } else if(person[k] == maxPerson){
            output.add(k);
          }
        }
		//最多の支持をされた有権者を出力する(最多が同数の場合は複数人出力する)
        for(int l = 0; l < output.size(); l++){
          System.out.println(output.get(l));    
        }
    }
}