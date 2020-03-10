
#include <iostream>
using namespace std;
int main()
{
    long long n,count=0;
    cin>>n;
    
    while(n>=5){
        count++;
        n=n-5;
    }
    while(n>=4){
        count++;
        n=n-4;
    }
    while(n>=3){
        count++;
        n=n-3;
    }
    while(n>=2){
        count++;
        n=n-2;
    }
    while(n>=1){
        count++;
        n=n-1;
    }
    cout<<count<<endl;
    return 0;
}
