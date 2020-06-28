#include <cstring>
#include <iostream>
#include<string>
using namespace std;
int main()
{
   string s;
  getline(cin,s);
  int i=0, word=0;
  for(i=0; s[i]!='\0'; i++)
  {
    if(s[i]==' ')
    {
      word++;
    }
  }
    if(++word>10)
      cout<<"Caption not eligible for the contest";
     else
       cout<<"Caption eligible for the contest";
   
}