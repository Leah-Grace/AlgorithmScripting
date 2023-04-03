#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int num = 0;
    cin>>num;
    string str = "";

    while (num > 0){
        cin>>str;
        for (int j = 0; j < str.length(); j += 2){
            cout<<str[j];
        }
        cout<<" ";
        for (int k = 1; k < str.length(); k += 2){
            cout<<str[k];
        }
        cout<<endl;
        --num;
    }

    return 0;
}
