#include <iostream>

using namespace std;

int main()
{
    float salarioMin, salarioUsu, total;

    cin >> salarioMin >> salarioUsu;

    total = salarioUsu / salarioMin;

    cout << "O usuario ganha: " << total << " salarios minimos" << endl;

    return 0;
}