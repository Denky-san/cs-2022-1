#include <iostream>

using namespace std;

int main()
{
    int anos, meses, dias, idadeEmDias = 0;

    cout << "Qual a sua idade, insira anos, meses e dias respectivamente" << endl;

    cin >> anos >> meses >> dias;

    idadeEmDias = (anos * 365) + (meses * 30) + dias;

    cout << "Sua idade em dias eh: " << idadeEmDias << endl;

    return 0;
}