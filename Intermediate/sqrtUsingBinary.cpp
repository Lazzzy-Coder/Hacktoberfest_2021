#include<iostream>
using namespace std;

int sqare(int,int,int);

int main(){
    int X;
    cout<<"Enter X: ";
    cin>>X;
    int result = sqare(X,0,X);
    cout<<result<<endl;
    return 1;
}

int sqare(int X,int low,int high){
    int ans = -1;
    while(low<=high){
        int mid = (low+high)/2;
        if((mid*mid)==X)
            ans = mid;
        else if(X>(mid*mid)){
            low = mid+1;
            ans = mid;
        }
        else{
            high=mid-1;
        }
    }
    return ans;
}