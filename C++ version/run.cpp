#include <fstream>
#include <iostream>
#include "qsort.cpp"
using namespace std;

int main()
{
    int n_numbers = 1000000;
    int *array = new int[n_numbers];
    ifstream file;
    file.open("../" + to_string(n_numbers) + "_numbers.txt");

    int i = 0;
    while(!file.eof())
        file >> array[i++];

    qsort(array, array + n_numbers,less<int>());
}