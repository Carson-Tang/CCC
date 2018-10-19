#include <cstdio>
#include <iostream>
#include <string>
#include <bits/stdc++.h>
using namespace std;
map<char,int> key;
int val[26][2];
int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    play();
    return 0;
}
void play(){
    string s = "ABCDEFGHIJKLMNOPQRSTUVWXY";
    for(int i = 1; i <= 25; i++){
        key[s.at(i-1)] = i;
    }
    for(int i = 1; i <= 50; i++){
        char k = faceup(i);
        if(val[key[k]][0]==0){
            val[key[k]][0]=i;
        } else {
            val[key[k]][1]=i;
        }
    }
    for(int i = 1; i <= 25; i++){
        faceup(val[i][0]);
        faceup(val[i][1]);
    }
}
