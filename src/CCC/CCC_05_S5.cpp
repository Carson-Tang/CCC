#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cstdlib>
using namespace std;
#define MAXN 200005
#define MOD 1000000007
#define INFINITE 0x3f3f3f3f
typedef long long ll;
typedef unsigned long long ull;
typedef pair<int,int>ii;
int t,n,arr[100001],idx; ll bit[100010];
double ans;
vector<int>v;
unordered_map<int,int>mp;
void update(int idx){
    while(idx<=100005){
        bit[idx]++;
        idx+=idx&-idx;
    }
}
int query(int idx){
    int sum = 0;
    while(idx>0){
        sum+=bit[idx];
        idx -= idx&-idx;
    }
    return sum;
}
int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cin>>t;
    for(int i = 0; i < t; i++){
        cin>>arr[i];
        v.push_back(arr[i]);
    }
    sort(v.begin(),v.end());
    v.erase(unique(v.begin(),v.end()),v.end());
    for(int i : v) mp[i] = ++idx;
    for(int i = 0; i < t; i++){
        ans += (double)(i+1-query(mp[arr[i]]))/t;
        update(mp[arr[i]]);
    }
    cout<<setprecision(2)<<fixed<<("%.2f",round(ans*100.0)/100.0)<<"\n";
    return 0;
}
