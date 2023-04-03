#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */

    map<string, int> phoneBook;
    int num = 0;
    cin>>num;
    string name;
    int phoneNumber = 0;

    while(num > 0){
        cin>>name;
        cin>>phoneNumber;
        phoneBook[name] = phoneNumber;
        --num;
    }
    string searchName;
    while(cin >> searchName){
        if(phoneBook.find(searchName) == phoneBook.end()){
            cout<<"Not found"<<endl;
        } else {
            cout<< phoneBook.find(searchName)->first <<"="<<phoneBook.find(searchName)->second<<endl;
        }
    }

    return 0;
}
