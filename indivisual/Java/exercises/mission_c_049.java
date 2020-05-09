import java.util.*;

/*
  エレベーターが何回動いたかを計算する。
  ただし、エレベーターは最初は必ず1階にいるものとする。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //エレベーターが動く回数
        int count = Integer.parseInt(sc.nextLine());
        //エレベーターが動いた階数
        int mv = 0;
        //前回何階にいたか
        int rePlace = 0;
        for (int i = 0; i < count; i++){
            //今、何階にいるか
            int place = Integer.parseInt(sc.nextLine());
            //動いた階数分加算する
            if(i == 0){
                mv = place - 1;
            } else if(rePlace >= place) {
                mv += rePlace - place;
            } else {
                mv += place - rePlace; 
            }
            rePlace = place;
        }
        System.out.println(mv);
    }
}
