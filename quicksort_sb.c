#include<stdio.h>
#include<stdlib.h>

void quicksort(int *,int,int);
int part(int *,int,int);
int fact(int);
void permute(int *,int,int);
int c=0;
FILE *fp;
int main(){
	int n,*arr;
	printf("Enter number of values: ");
	scanf("%d",&n);
	fp = fopen("input.txt","w+");
	if(fp==NULL){
		printf("File Error");
		return 1;
	}
	arr=(int *)malloc(n*sizeof(int));
	for(int i=0;i<n;i++)
		arr[i]=(i+1);
	permute(arr,n,n);
	fclose(fp);
	fp =fopen("input.txt","r");
	int total_comp=0;
	int f = fact(n);
	FILE *fout = fopen("output.txt","w");
	for(int i=0;i<f;i++)
	{
		for(int k=0;k<n;k++)
			fscanf(fp,"%d",&arr[k]);
		c=0;
		quicksort(arr,0,n-1);
		total_comp += c;
		for(int k=0;k<n;k++)
			fprintf(fout,"%d ",arr[k]);
		fprintf(fout,"\nNumber of Comparisons: %d\n\n",c);		}
	
	fprintf(fout,"\nTotal number of Comparisons: %d\nAverage Number of Comparisons: %.2f\n",total_comp,(total_comp*1.0)/f);
	
	fclose(fp);
	fclose(fout);
	return 0;
}

void permute(int *a,int s,int n)
{
	if(s==1)
	{
		for(int k=0;k<n;k++)
			fprintf(fp,"%d ",a[k]);
		fprintf(fp,"\n");
	}

	for(int i=0;i<s;i++)
	{
		permute(a,s-1,n);

		if(s%2==1)
		{
			// int t=a[0];
			// a[0]=a[s-1];
			// a[s-1]=t;
			swap(a,0,s-1);
		}
		else
		{
			// int t=a[i];
			// a[i]=a[s-1];
			// a[s-1]=t;
			swap(a,i,s-1);
		}
	}
}

int fact(int n){
	if(n==1)
		return 1;
	return n*fact(n-1);
}
void swap(int *a,int x,int y)
{
	int temp= x;
	x=y;
	y=temp;
}
void quicksort(int *a,int l,int h){
	if(l<h)
	{
		int p = r_part(a,l,h);
		quicksort(a,l,p-1);
		quicksort(a,p+1,h);
	}
}
int r_part(int *a,int l,int h)
{
	srand(time(0));
	int r=(rand()%(h-l+1))+l;
	// int t=a[r];
	// a[r]=a[h];
	// a[h]=t;
	swap(a,a[r],a[h]);
	return part(a,l,h);
}
int part(int *a,int l,int h){
	int p=a[h];
	int i=l-1,j=l;
	for(;j<h;j++)
	{	
		c++;
		if(a[j]<p)
		{
			i++;
			swap(a,a[j],a[i]);
			// int t=a[j];
			// a[j]=a[i];
			// a[i]=t;
		}
	}
	i++;
	// int t=a[i];
	// a[i]=a[h];
	// a[h]=t;
	swap(a,a[i],a[h]);
	return i;
}

/*
int part(int *a,int l,int h)
{
    int Pivot=a[l];
    int i=l,j=h,temp;
    do{
        do{i++;}while(a[i]<=Pivot);
        do{j--;}while(a[j]>Pivot);
        if(i<j)
            {
                 temp= a[i];
                a[i]=a[j];
                a[j]=a[i];
            }
    }while(i<j);
        temp=a[l];
        a[l]=a[h];
        a[h]=temp;
        return j;
    
}
*/