
/*#include<iostream>
using namespace std;
inline int cube(int no)
{
	return no*no*no;
}

int main()
{
	int no;
	cout<<"Enter number : ";
	cin>>no;
	cout<<"Cube of number :"<<cube(no)<<endl;
	return 0;
}*/




/*#include<iostream>
using namespace std;

int cubevolume(int l=5,int w=6, int h=7)
{
	l = l++;
	w = w-1;
	h = h+l;
	return l*w*h;
}
int main()
{
	cout<<cubevolume()<<endl;
	cout<<cubevolume(9)<<endl;
	cout<<cubevolume(15,12)<<endl;
	cout<<cubevolume(3,4,7)<<endl;

}*/



#include<iostream>
using namespace std;
int myfun(int i);
int myfun(int i,int j);
int myfun(int i,int j,int k);
int main()
{
cout<<"Calling myfun(10) : "<<myfun(10)<<endl;
cout<<"Calling myfun(a) : "<<myfun(a)<<endl;
cout<<"Calling myfun(10,20) : "<<myfun(10,20)<<endl;
cout<<"Calling myfun(10,20,30) : "<<myfun(10,20,30)<<endl;
return 0;
}
int myfun(char i)
{
return i;
}
char myfun(int i)
{
return 'a';
}
int myfun(int i,int j)
{
return i+j;
}
int myfun(int i,int j,int k)
{
return i+j+k;
}










