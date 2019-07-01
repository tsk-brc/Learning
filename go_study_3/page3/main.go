package main

import "fmt"

func main() {
	// ask関数を呼び出してください
	ask()
	
}

// ask関数を定義してください
func ask() {
    // 以下のコードを切り取ってください
	var input string
	fmt.Println("次の単語を入力してください: dog")
	fmt.Scan(&input)
	fmt.Printf("%sと入力されました", input)
	// ここから上を切り取ってください
}
