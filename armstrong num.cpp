#include<iostream>
#include<cmath>
using namespace std;
int main()
{ int n,sum=0;
  cout<<"enter the num"<<endl;
  cin>>n;
  int temp=n;
  
  while(n>0)
  {
  	int lastdigit=n%10;
  	sum+=pow(lastdigit,3);
  	n=n/10;
  	
  }
  if(sum==temp)
  cout<<"it is an armstrong number";
  else
  cout<<"it is not an armstrong num";
  
return 0;
}
