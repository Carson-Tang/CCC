#include <iostream>
#include <bits/stdc++.h>
#include <string>
using namespace std;
#define MAXN 100001
#define MOD 1000000007

typedef long long ll;
typedef pair<int,int>ii;
int a,b,c,d; string s;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    a=1; b=2; c=3; d=4;
    cin>>s;
    for(int i = 0; i < s.length(); i++){
        if(s[i]=='H'){
            swap(a,c);
            swap(b,d);
        } else {
            swap(a,b);
            swap(c,d);
        }
    }
    cout<<a<<" "<<b<<"\n";
    cout<<c<<" "<<d<<"\n";
    return 0;
}
