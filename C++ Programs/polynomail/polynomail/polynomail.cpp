#include<iostream>
#include<math.h>
using namespace std;
class Polynomial
  {
    private: 
        int  a[50],b[50],c[50];
        int m,n;
        
    public:
        void get_coeff_a();
        void get_coeff_b();
        void display_eqn();
        void add_polynomial();
        void mul_polynomial();

  };
  
void Polynomial::get_coeff_a()
 {
    cout<<"Enter the degree of polynomial 1"<<endl;
    cin>>m;   
    cout<<"Enter the coefficient for polynomial"<<endl;
    for(int i=m;i>=0;i--)
     {
       cin>>a[i];
     }   

 }
void Polynomial::get_coeff_b()
 {
    cout<<"Enter the degree of polynomial 2"<<endl;
    cin>>n;   
    cout<<"Enter the coefficient for polynomial"<<endl;
      for(int j=n;j>=0;j--)
     {
       cin>>b[j];
     }


 } 
void Polynomial::display_eqn()
 {
   cout<<"equation of polynomial 1 is ="<<endl;
   for(int i=m;i>=0;i--)
      { 
         cout<<a[i];
         cout<<"x^"<<i;
         if(i>=1)
          {  
          cout<<"+";
          }
      }
    cout<<endl;
    cout<<"equation of polynomial 2 is ="<<endl;
   for(int j=n;j>=0;j--)
      { 
         cout<<b[j];
         cout<<"x^"<<j;
         if(j>=1)
          {
           cout<<"+";
          }
      }
   cout<<endl;

 } 

 void Polynomial::add_polynomial()
 {
   cout<<"Addition of polynomial is ="<<endl; 
    for(int i=m;i>=0;i--)
      {
         for(int j=n;j>=0;j--)
            {
                          
               if(m>n)
                   {
                      for(int i=m;i>n;i--)
                       {
                         cout<<a[i];
                         cout<<"x^"<<i;
                         if(i>=1)
                           {  
                             cout<<"+";
                           }
                       }
                     for(i=n;i>=0;i--)
                        { 
                        for(j=i;j>=0;j--)
                          {
                            if(i==j)
                             { 
                               cout<<a[i]+b[j];
                               cout<<"x^"<<i;
                               if(i>=1)
                                {
                                 cout<<"+";
                                }
                             }
                          }
                       }
                  }
                 
               else
                 {  
                    for(int j=n;j>m;j--)
                       {
                         cout<<b[j];
                         cout<<"x^"<<j;
                         if(j>=1)
                           {  
                             cout<<"+";
                           }
                       }
                   
                   for(i=m;i>=0;i--)
                      { 
                       for(j=i;j>=0;j--)
                         {
                           if(i==j)
                             {
                               cout<<a[i]+b[j];
                               cout<<"x^"<<i;
                               if(i>=1)
                                {
                                  cout<<"+";
                                }
                             }
                       }
                    }
                 }
            
            }        
      } 
    cout<<endl;  
 }
 void Polynomial::mul_polynomial()
 {
    for(int i=m;i>=0;i--)
      {
         for(int j=n;j>=0;j--)
            {
              cout<<a[i]*b[j];
              cout<<"x^"<<i+j;
              if(i>=0)
                  {
                    cout<<"+";
                  } 
            }
      } 
            
 }
  
void main()
  { 
    Polynomial p;
   int x;
    p.get_coeff_a();
    p.get_coeff_b();
    p.display_eqn();
    p.add_polynomial();
    p.mul_polynomial();
   cin>>x;
   }
 
