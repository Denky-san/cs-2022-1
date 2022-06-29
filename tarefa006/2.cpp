#include <iostream>

using namespace std;

int main()
{
    float media1, media2;

    media1 = (7 + 8 + 9) / 3;
    media2 = (4 + 5 + 6) / 3;

    cout << "A media dos numeros 8, 9 e 7 eh: " << media1 << endl;
    cout << "A media dos numeros 4, 5 e 6 eh: " << media2 << endl;
    cout << "A soma das duas medias eh: " << media1 + media2 << endl;
    cout << "A media das duas medias eh: " << (media1 + media2) / 2 << endl;

    return 0;
}