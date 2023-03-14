package main

import (
	"bufio"
	"fmt"
	"io"
	"os"
	"strconv"
	"strings"
)

func solve(meal_cost float64, tip_percent int32, tax_percent int32) {

	var tip_cost float64
	var tax_cost float64
	var total_cost float64

	tip_cost = (float64(tip_percent) * meal_cost) / 100
	tax_cost = (float64(tax_percent) * meal_cost) / 100
	total_cost = meal_cost + tip_cost + tax_cost

	fmt.Printf("%.0f\n", total_cost)
}

func main() {
	reader := bufio.NewReaderSize(os.Stdin, 16*1024*1024)

	meal_cost, err := strconv.ParseFloat(strings.TrimSpace(readLine(reader)), 64)
	checkError(err)

	tip_percentTemp, err := strconv.ParseInt(strings.TrimSpace(readLine(reader)), 10, 64)
	checkError(err)
	tip_percent := int32(tip_percentTemp)

	tax_percentTemp, err := strconv.ParseInt(strings.TrimSpace(readLine(reader)), 10, 64)
	checkError(err)
	tax_percent := int32(tax_percentTemp)

	solve(meal_cost, tip_percent, tax_percent)
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
