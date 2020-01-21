package main

/*
  簡易ポーカーを行う。ルールは以下の通り。
  ・手札が4枚で、この4枚の組み合わせにより以下の5種類の役が存在する。
    ・Four Card：同じ数字4枚からなる役
	・Three Card：同じ数字3枚とそれ以外の数字1枚からなる役
	・Two Pair：同じ数字2枚のペア2つからなる役
	・One Pair：同じ数字2枚とそれ以外の相異なる数字2枚からなる役
	・No Pair：上の4つ以外(4枚が全て相異なる数字)
  ・簡易ポーカーでは手札4枚の数字を小さい順に並べたものが配られる。
*/
import (
    "bufio"
    "fmt"
    "os"
    "strconv"
)

var sc = bufio.NewScanner(os.Stdin)

//文字列を数値に変換
func nextInt() int {
    sc.Scan()
    i, e := strconv.Atoi(sc.Text())
    if e != nil {
        panic(e)
    }
    return i
}

func main(){
    //スペース区切りで読み込む
    sc.Split(bufio.ScanWords)

    //ゲームの回数
    a := nextInt()
    for i := 0; i < a; i++{
        sc.Scan()
		//配られたカード
        str := sc.Text()
		
		//配られたカードの1枚目
        one := string([]rune(str[0:1]))
		
		//配られたカードの2枚目
        two := string([]rune(str[1:2]))
		
		//配られたカードの3枚目
        three := string([]rune(str[2:3]))
		
		//配られたカードの4枚目
        four := string([]rune(str[3:4]))
		
		//Pair check
        if one == two && two == three && three == four {
          fmt.Println("Four Card")
        } else if((one == two && two == three) || (two == three && three == four)){
          fmt.Println("Three Card")
        } else if(one == two && three == four){
          fmt.Println("Two Pair")
        } else if(one == two || two == three || three == four){
          fmt.Println("One Pair")
        } else {
          fmt.Println("No Pair")
        }
    }
}