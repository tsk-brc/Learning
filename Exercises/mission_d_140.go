package main

/*
  1から10の整数Nと10個の単語が与えられる。
  N番目の単語を出力する。
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

    //入力データを受け取る
    a := nextInt()
    //入力データを格納する配列
    s := []string{}
	
    //入力データを配列に格納
    for i := 0; i < 10; i++{
        sc.Scan()
        s = append(s, sc.Text())
    }
	
    //値を出力
    fmt.Println(s[a - 1])
}
