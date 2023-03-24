import re


def split_string(string):
    name = string[0]
    email = string[1]
    return name, email


list_names = []
n_inputs = int(input())

for i in range(n_inputs):

    name, email = split_string(str(input()).split(" "))

    if re.search(".+@gmail.com$", email):
        list_names.append(name)

list_names.sort()

for name in list_names:
    print(name)
