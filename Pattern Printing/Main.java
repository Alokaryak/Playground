#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int n,star=0;
  int space;
  
  cin>>n;
  int i,j,iterm=1,rterm;
  rterm=n*n +1;
  for(i=n;i>0;i--)
  {
    
    for(space=i;space<n;space++)
    {
      cout<<"**";
    }
    for(int j=1;j<=i;j++)
    {
      cout<<iterm<<"0";
      iterm++;
    }
    for(j=1;j<=i;j++)
    {
      cout<<rterm;
      if(j<i)
      {
        cout<<"0";
      }
        rterm++;
    }
      rterm = rterm - (i -1) * 2 -1;
      cout<<endl;
  }
  return 0;
}