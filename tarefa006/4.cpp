#include <iostream>

using namespace std;

int main()
{
    float IPI, codigoPeca1, valorPeca1, qtdPeca1, codigoPeca2, valorPeca2, qtdPeca2, valorTotal;

    cin >> IPI >> codigoPeca1 >> valorPeca1 >> qtdPeca1 >> codigoPeca2 >> valorPeca2 >> qtdPeca2;

    valorTotal = ((valorPeca1 * qtdPeca1) + (valorPeca2 * qtdPeca2)) * (IPI / 100 + 1);

    cout << valorTotal << endl;

    return 0;
}