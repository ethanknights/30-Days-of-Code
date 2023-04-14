# Generate phonebook dict and return queries afterward
n_entries = int(input().strip())  # Number of phonebook definitions incoming


def create_phonebook(n_entry):
    phonebook = dict()    # Takes nEntries as user input('Ethan 9923')

    for _i in range(0, n_entry):
        entry = str(input())

        split_entry = entry.split()

        name = split_entry[0]
        number = split_entry[1]

        phonebook[name] = number

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
