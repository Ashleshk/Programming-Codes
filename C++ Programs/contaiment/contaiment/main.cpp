#include <iostream>

using namespace std;

int main()
{
    long sumOfSquares = 0;
    long sum = 0;
    long squareOfSums = 0;

    for (int i = 1; i < 1001; i++){sumOfSquares += i*i; sum += i;}
    squareOfSums = sum*sum;
    cout << endl << "The difference between the sum of the squares and the square of the sums of the first 1000 natural numbers is: " << abs(squareOfSums-sumOfSquares) << "." << endl;
    return 0;
}
