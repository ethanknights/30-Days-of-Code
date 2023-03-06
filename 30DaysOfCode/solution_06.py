

def splitEvenOdd(myStrings):

    evenString = str()
    oddString = str()

    for idx, i in enumerate(myStrings):
        if (idx % 2) == 0:
            evenString += i
        else:
            oddString += i

    return str(evenString), str(oddString)


nStrings = int(input())
for i in range(0, nStrings):
    myString = str(input())

    evenString, oddString = splitEvenOdd(myString)

    concatString = str(evenString + ' ' + oddString)
    print(concatString)
