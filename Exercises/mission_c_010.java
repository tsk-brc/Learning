import java.util.*;

/*
  休息ができるかどうかを判定する。
  ある公園で工事が行われている。工事現場は公園にただ1つだけあり、その位置は(a, b)で表される。
  工事現場から距離Rメートル未満は騒音が大きく、休息することができない。
  公園にはN本の木が植えられており、各木に対して休息するのに向いているかどうかを判定する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //工事現場のx座標
　　　　　int x = Integer.parseInt(sc.next());
        //工事現場のy座標
　　　　　int y = Integer.parseInt(sc.next());
        //工事現場の騒音が届く半径
　　　　　int r = Integer.parseInt(sc.next());
　　　　　//木の数
        int tree = Integer.parseInt(sc.next());
        for(int i = 0; i < tree; i++){
　　　　　　//木のx座標
          int targetX = Integer.parseInt(sc.next());
          //木のy座標
　　　　　　int targetY = Integer.parseInt(sc.next());
　　　　　　//工事現場の騒音が届くかどうかを判定
          if((targetX - x) * (targetX - x) + (targetY - y) * (targetY - y) >= r * r){
            System.out.println("silent");
          } else {
            System.out.println("noisy");
          }
        }
    }
}
