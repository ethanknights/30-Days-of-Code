# Generate phonebook dict and return queries afterward
#
# Sample Input
# 3
# sam 99912222
# tom 11122222
# harry 12299933
# sam
# edward
# harry
#
# Sample Output
# sam=99912222
# Not found
# harry=12299933
# --
n_entries = int(input().strip())  # Number of phonebook definitions incoming


def create_phonebook(n_entry):
    # Takes nEntries as user input('Ethan 9923')
    phonebook = dict()

    for _i in range(0, n_entry):
        entry = str(input())
        # print(entry)

        split_entry = entry.split()

        name = split_entry[0]
        number = split_entry[1]

        phonebook[name] = number

    # print(phonebook)
    return phonebook


def query_phonebook(phonebook):
    while True:  # Run without conditions, until break statement executes
        try:
            query = str(input())
            if query in phonebook:
                print(str(query) + "=" + str(phonebook[query]))
            else:
                print("Not found")
        except:
            break


phonebook = create_phonebook(n_entries)

query_phonebook(phonebook)
