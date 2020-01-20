import java.util.*;

/*
  暗号化され他文章を復元する。
  アルファベット順に対応する置換ルールと置換する回数が提供されるので、それに合わせて元の文章を復元する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
		//置換回数
        int replace =Integer.parseInt(sc.next());
        //置換ルール
		String str = sc.next();
        //ダミーデータ(改行コードのみ)
		String Dummy = sc.nextLine();
		//暗号化されたデータ
        String target = sc.nextLine();
		//置換ルールをアルファベットごとに格納する配列
        String[] English = new String[26];
		//アルファベットを配列に格納
        String[] alphabet = new String[26];
        String copy = target;
        alphabet[0] = "a";
        alphabet[1] = "b";
        alphabet[2] = "c";
        alphabet[3] = "d";
        alphabet[4] = "e";
        alphabet[5] = "f";
        alphabet[6] = "g";
        alphabet[7] = "h";
        alphabet[8] = "i";
        alphabet[9] = "j";
        alphabet[10] = "k";
        alphabet[11] = "l";
        alphabet[12] = "m";
        alphabet[13] = "n";
        alphabet[14] = "o";
        alphabet[15] = "p";
        alphabet[16] = "q";
        alphabet[17] = "r";
        alphabet[18] = "s";
        alphabet[19] = "t";
        alphabet[20] = "u";
        alphabet[21] = "v";
        alphabet[22] = "w";
        alphabet[23] = "x";
        alphabet[24] = "y";
        alphabet[25] = "z";
		//置換ルールを配列に1文字ずつばらす
        for(int i = 0; i < str.length(); i++){
          English[i] = str.substring(i , i + 1);
        }
		//置換回数分、処理を実行
        for(int j = 0; j < replace; j++){
          StringBuilder sb = new StringBuilder();
          for(int k = 0; k < copy.length(); k++){
            for(int l = 0; l < 26; l++){
              //スペースはそのままスペースとする
			  if(copy.substring(k, k + 1).equals(" ")){
                sb.append(" ");
                break;
              } else {
			    //ルールと照合して置換する
                if(copy.substring(k, k + 1).equals(English[l])){
                  sb.append(alphabet[l]);
                  break;
                }
              }
            }
          }
          copy = sb.toString();
        }
        System.out.println(copy);
    }
}