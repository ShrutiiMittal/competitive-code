#include<iostream>
using namespace std;

class store
{int id[50];
int price[50];
int count;
public:
	void setcounter()
	{count=0;
	}
	void setdata()
	{
	  cout<<"enter id"<<endl;
	  cin>>id[count];
	  cout<<"enter price"<<endl;
	  cin>>price[count];
	  count++;
	}
	void displayprice()
	{for(int i=0;i<count;i++)
	cout<<"for item "<<i+1<<" having id "<<id[i]<<" the price is  "<<price[i]<<endl;
	}
	
};


int main()
{store dukaan,kiraana;
dukaan.setcounter();
dukaan.setdata();
dukaan.setdata();
dukaan.setdata();

dukaan.displayprice();
kiraana.setcounter();

kiraana.setdata();
kiraana.setdata();
kiraana.setdata();
kiraana.setdata();
kiraana.displayprice();


 
return 0;
}
