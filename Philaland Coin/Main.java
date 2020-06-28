#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int t;
  cin>>t;
  while(t--)
  {
  int n;
  cin>>n;
  int c=0;
  while(n!=0)
  {
    n=n/2;
    c++;
  }
  cout<<c<<endl;
  }
  
  return 0;
}