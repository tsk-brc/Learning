package main

import "fmt"
import "math/rand"
//「time」パッケージをインポートしてください
import "time"

func main() {
    // 指定されたコードを追加してください
    rand.Seed(time.Now().Unix())
    
    for i := 1; i <= 5; i++ {
        fmt.Println(rand.Intn(10))
    }
}
