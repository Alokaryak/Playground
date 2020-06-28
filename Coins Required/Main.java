#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int n;
  cin>>n;
  int f=0,t=0,o=0;
  f=f+ (n-4)/5;

  if((n - f*5)%2==0)
  {
    o+=2;
  }
  else
  {
    o+=1;
  }

  t= t+ (n- (f*5 + o*1))/2;
  
  cout<<t+f+o<<" "<<f<<" "<<t<<" "<<o;
  
  return 0;
}