#include <iostream>
#include <bits/stdc++.h>
#include <string>
using namespace std;
#define MAXN 100001
#define MOD 1000000007
typedef long long ll;
typedef pair<int,int>ii;
int n; string ans,in;
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>n;
    while(n--){
        ans = "";
        cin>>in;
        int cnt = 1; char last = in[0];
        for(int i = 1; i < in.length(); i++){
            if(in[i]!=last){
                ans += to_string(cnt)+" "+last+" ";
                cnt=1;
                last = in[i];
            } else cnt++;
        }
        ans += to_string(cnt)+" "+last+" ";
        cout<<ans<<"\n";
    }
    return 0;
}
