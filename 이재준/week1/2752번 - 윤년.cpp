#include<iostream>
using namespace std;

// 4의 배수이면서 100의 배수가 아닐 때 or 4의 배수이면서 400의 배수일 때
// 4의 배수 and 100의 배수 아닐 때 , 4의 배수 and 400의 배수

bool check(int n) {
    if(n% 4 != 0) {
        return false;
    }
    if(n % 100 != 0) {
        return true;
    }
    if(n % 400 == 0 ) {
        return true;
    }
    return false;
}

int main() {
    int year;
    cin >> year;
    if(check(year)) {
        cout << 1 << endl;
    }
    else{
        cout << 0 << endl;
    }
}
