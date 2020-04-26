 
/* ********************* PROBLEM DEFINITION ***************************
 * Write a program to calculate the sum and smallest element in the list, and to check
 * whether the given number is present in the list and the number of times of the occurrence
 * of that number using member function of a class as a template function.
 */
#include<iostream>
#include<cstdlib>
using namespace std;
template<class T>
class example
{
  T num[10];
public:
  void inputdata()
  {
		cout<<"Enter the elements:"<<endl;
		for(int i=0;i<5;i++)
		{
			cin>>num[i];
		}
  }
  void displaydata()
  {
	  cout<<"Entered elements are as follows:"<<endl;
	  for(int i=0;i<5;i++)
	  {
		  cout<<num[i]<<endl;
	  }
  }
  void sumOfElements()
  {
	  T sum=0;
	  for(int i=0;i<5;i++)
	  {
		  sum += num[i];
	  }
	  cout<<"Sum of elements is : "<<sum<<endl;
  }
 void smallestElement()
  {
	  T n=num[0];
	  for(int i=1;i<5;i++)
	  {

		  if(n > num[i] )
		  {
			  n = num[i];
		  }
	  }
	  cout<<"The smallest number is :"<<n<<endl;

  }
  void checkNumber()
  {
    T n;
    int flag=0;
    cout<<"Enter the number to be checked :"<<endl;
    cin>>n;
    for(int i=0;i<5;i++)
    {
    	if( n == num[i])
    	  flag =1;
    }
    if(flag == 1)
     cout<<"Number is present in the list."<<endl;
    else
     cout<<"Number is not present in the list"<<endl;
  }
  void occurrenceOfNumber()
  {
    int count =0;
    T n;
    cout<<"Enter the number whose occurence is to be find: "<<endl;
    cin>>n;
    for(int i=0;i<5;i++)
    {
    	if(n== num[i])
    		count ++;
    }
    cout<<"Occurrence of entered number is: "<<count<<endl;
  }
};
int main()
{
 example <int>e1;
 example <float>e2;
  int choice;
  char ch;
  int choice1;
 
  do
  {
	          cout<<"\n1:enter integer values \n2: enter float values \n3:exit"<<endl;
                cout<<"Enter your choice"<<endl;
                cin>>choice1;
 
          switch(choice1)
             {
       case 1:    do
                 {
    	            cout<<"\n1: Input data \n2:display data \n3: To find sum of all elements \n4:To find smallest element in the list   \n5:To check whether the given number is present in the list \n6:To find occurrence of given number in the list."<<endl;
                    cout<<"Enter your choice"<<endl;
                    cin>>choice;
                 switch(choice)
                   {
                      case 1: e1.inputdata();
                                break;
                      case 2: e1.displaydata();
                                break;
                      case 3: e1.sumOfElements();
                                break;
                      case 4: e1.smallestElement();
                                break;
                      case 5: e1.checkNumber();
                                break;
                      case 6:e1.occurrenceOfNumber();
                                break;
                      case 7:
                               break;
                      default:
                    	  cout<<"Wrong choice:"<<endl;
                   }
              cout<<"Do you want to continue?(y/n)"<<endl;
              cin>>ch;
           }while(ch=='y'||ch=='Y');
            break;
             
    case 2: do
           {
    	      cout<<"\n1: Input data \n2:display data \n3: To find sum of all elements \n4:To find smallest element in the list   \n5:To check whether the given number is present in the list \n6:To find occurrence of given number in the list."<<endl;
              cout<<"Enter your choice"<<endl;
              cin>>choice;
                
                switch(choice)
                {
                case 1: e2.inputdata();
                        break;
                case 2: e2.displaydata();
                        break;
                case 3: e2.sumOfElements();
                        break;
                case 4: e2.smallestElement();
                        break;
                case 5: e2.checkNumber();
                        break;
                case 6:e2.occurrenceOfNumber();
                        break;
                case 7:
                        break;
                default:
                    cout<<"Wrong choice:"<<endl;

             }
           cout<<"Do you want to continue?(y/n)"<<endl;
           cin>>ch;
        }while(ch=='y'||ch=='Y');
           break;
   case 3:
      	  exit(0);
          break;
   default:
        	  cout<<"Wrong choice!!"<<endl;
  }
  cout<<"Do you want to continue?(y/n)"<<endl;
  cin>>ch;
}while(ch=='y'||ch=='Y');
  return 0;
}

