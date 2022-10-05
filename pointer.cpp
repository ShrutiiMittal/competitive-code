#include<iostream>
using namespace std;
class complex{
	int real ,imaginary;
	public:
		void setdata(int a,int b){
			real=a;
			imaginary=b;
		}
		void getdata(){
			cout<<"the real part is"<<real<<endl;
			cout<<"the img part is"<<imaginary<<endl;
			
		}
};

int main()
{
   complex* c=new complex;
   (*c).setdata(1,7);
   (*c).getdata();
   	
	complex* pt=new complex;
	pt->setdata(6,9);
	pt->getdata();
	
	complex* pt1=new complex[4];
	pt1->setdata(3,4);
	pt1->getdata();
	pt1++;
	pt1->setdata(6,7);
	pt1->getdata();
	pt1++;
	pt1->setdata(9,4);
	pt1->getdata();
	pt1++;
	pt1->setdata(0,1);
	pt1->getdata();
	
	

	int a=4;
	int* p=&a;
	cout<<"the value of a is"<<*(p)<<endl;
	float* ptr =new float(60.87);
	cout<<"the adress of ptr is"<<*(ptr)<<endl;
	int *arr= new int[3];
	for(int i=0;i<3;i++)
	{arr[i]=10*i;
	}
	for(int i=0;i<3;i++)
	{cout<<"the value of arr["<<i<<"] is "<<arr[i]<<endl;
	}
	return 0;
}
