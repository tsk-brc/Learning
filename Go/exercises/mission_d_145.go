package main

/*
  ゲームプレイヤーはスタミナのポイントNを所持しており、1プレイあたりMポイントを消費する。
  何回プレイ出来るかを出力する
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
    b := nextInt()
	
	//値を出力
    fmt.Println(a / b)
}