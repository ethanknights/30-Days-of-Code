package main
import (
    "bufio"
    "fmt"
    "os"
)

func main() {

// var myString string // input
// fmt.Println("Hello, world")
// fmt.Scanln(&myString) // input
// fmt.Println(myString) // input

reader := bufio.NewReader(os.Stdin)
userText, _ := reader.ReadString('\n')
fmt.Printf("Hello, World.\n%s", userText)

}