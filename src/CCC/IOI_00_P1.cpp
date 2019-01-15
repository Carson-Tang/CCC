#include <iostream>
#include <bits/stdc++.h>
#include <string>
using namespace std;
#define INFINITE 0x3f3f3f3f
#define MAXN 100001
#define MOD 1000000007
typedef long long ll;
typedef pair<int,int>ii;
int n, dp[2][5001]; string s,sp;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n>>s;
    sp = s;
    reverse(sp.begin(),sp.end());
    // find lcs
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
            if(s[i-1]==sp[j-1]){
                dp[(i+1)%2][j] = dp[i%2][j-1] + 1;
            } else dp[(i+1)%2][j] = max(dp[(i+1)%2][j-1],dp[i%2][j]);
        }
    }
    cout<<(n-dp[(n+1)%2][n])<<"\n";
    return 0;
}
