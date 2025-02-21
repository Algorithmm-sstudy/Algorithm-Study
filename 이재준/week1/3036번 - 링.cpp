#include<iostream>
using namespace std;

int gcd(int a, int b) {
    if(a % b == 0) {
        return b;
    }
    return gcd(b, a % b);
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    int arr1[101];
    cin >> n;

    for(int i = 0; i < n; i++) {
        cin >> arr1[i];
    }
    for(int j = 1; j < n; j++) {
        cout << arr1[0] / gcd(arr1[0],arr1[j]) << "/" << arr1[j] / gcd(arr1[0],arr1[j]) << endl;
    }
}