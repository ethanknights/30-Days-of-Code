/* Complile using:
g++ -std=c++0x -o solution_cpp solution.cpp
./solution_cpp
*/
#include <iostream>
#include <vector>

using namespace std;

template<typename Element>

void printArray(vector<Element> arr) {
    for (int i = 0; i < arr.size(); i++)
        cout << arr[i] << endl;
}

int main() {
    vector<int> vInt{1, 2, 3};
    vector<string> vString{"Hello", "World"};

    printArray<int>(vInt);
    printArray<string>(vString);

    return 0;
}
