package main

import (
	"bufio"
	"fmt"
	"io"
	"os"
	"strconv"
	"strings"
)

func main() {
	reader := bufio.NewReaderSize(os.Stdin, 16*1024*1024)

	NTemp, err := strconv.ParseInt(strings.TrimSpace(readLine(reader)), 10, 64)
	checkError(err)
	val := int32(NTemp)

	if val%2 == 0 {

		if val >= 2 && val <= 5 {
			fmt.Println("Not Weird")

		} else if val >= 6 && val <= 20 {
			fmt.Println("Weird")

		} else if val > 20 {
			fmt.Println("Not Weird")
		}
	} else {
		fmt.Println("Weird")
	}
}

func readLine(reader *bufio.Reader) string {
	str, _, err := reader.ReadLine()
	if err == io.EOF {
		return ""
	}

	return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
	if err != nil {
		panic(err)
	}
}
