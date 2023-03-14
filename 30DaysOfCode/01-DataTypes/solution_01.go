package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	var _ = strconv.Itoa // Ignore this comment. You can still use the package "strconv".

	var i uint64 = 4
	var d float64 = 4.0
	var s string = "HackerRank "

	scanner := bufio.NewScanner(os.Stdin)

	var myInt uint64
	var myDouble float64
	var myString string

	fmt.Scan(&myInt)
	fmt.Scan(&myDouble)
	scanner.Scan()
	myString = scanner.Text()

	fmt.Println(i + myInt)
	fmt.Printf("%.1f\n", d+myDouble)
	fmt.Printf("%s%s", s, myString)

}
