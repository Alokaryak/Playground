#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int n;
  std::cin>>n;
  for(int i=1;i<=n/2;i++)
  {
    if(n%i==0)
    {
      cout<<i<<" ";
    }
  }
  cout<<n;
  
  
  
  return 0;
}