#include <iostream>
#include <bits/stdc++.h>
#include <string>
using namespace std;
#define MAXN 100001
#define MOD 1000000007
typedef long long ll;
typedef pair<int,int>ii;
int l,n; char x;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>l;
    while(l--){
        cin>>n>>x;
        while(n--){
            cout<<x;
        }
        cout<<"\n";
    }
    return 0;
}
