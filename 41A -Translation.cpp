#include<bits/stdc++.h>
using namespace std;

int main(){
    string str,rev;
    cin>>str>>rev;
    reverse(str.begin(),str.end());
    if(rev.compare(str)==0)
        cout<<"YES";
    else
        cout<<"NO";
    
    
    return 0;
}
