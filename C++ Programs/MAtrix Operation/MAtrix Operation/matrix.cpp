#include<iostream>
using namespace std;
class matrix
 {
     private: int mat1[10][10],mat2[10][10],mat3[10][10],i,j,k,r1,c1,r2,c2;
  
     public:
         void get_matrix();
         void put_matrix();
         void upper_triangular_matrix(); 
         void sum_of_diagonal_elements();
         void transpose_matrix();
         void add_matrix();
         void sub_matrix();
         void mul_matrix();
         void saddle_point();
 };
void matrix::get_matrix()
  {
       
         cout<<"enter the no of rows and column  for a matrix1:"<<endl;
         cin>>r1>>c1;
         cout<<"enter the no of rows and column  for a matrix2:"<<endl;
         cin>>r2>>c2;
     cout<<"Enter the elements of matrix1: "<<endl;
     for(i=0;i<r1;i++)
        {
         for(j=0;j<c1;j++)
          {
            cin>>mat1[i][j];
          }
        }
     cout<<"Enter the elements of matrix2: "<<endl;
     for(i=0;i<r2;i++)
        {
         for(j=0;j<c2;j++)
          {
            cin>>mat2[i][j];
          }
        }
   }
void matrix::put_matrix()
{
    cout<<"matrix1:"<<endl;
     for(i=0;i<r1;i++)
        {
         for(j=0;j<c1;j++)
          {
            cout<<mat1[i][j];
          }
         cout<<endl;
        }
      cout<<"matrix2:"<<endl;
     for(i=0;i<r2;i++)
        {
         for(j=0;j<c2;j++)
          {
            cout<<mat2[i][j];
          }
         cout<<endl;
        }

}

void matrix::upper_triangular_matrix()
{
    cout<<"The upper triangular matrix for matrix1 is:"<<endl;
   for(i=0;i<r1;i++)
        {
         for(j=0;j<i;j++)
          {
            mat1[i][j]=0;
          
          }
        }
   for(i=0;i<r1;i++)
     {
       for(j=0;j<c1;j++)
          {
             cout<<mat1[i][j];
          }
       cout<<endl;
     }    
}

void matrix::sum_of_diagonal_elements()
{
     int sum=0;
      cout<<"sum of diagonal element of matrix1 is:"<<endl;
       for(i=0;i<r1;i++)
         { 
           for(j=0; j<c1; j++)
              {
                if(i==j) 
                   {
                     sum=sum+mat1[i][j];
                   }
              } 
         }
        cout<<sum<<endl;
}
void matrix::transpose_matrix()
 {
    int temp;
    cout<<"The transpose of a matrix2 is:"<<endl;
    for(i=0;i<r2;i++)
      {
        for(j=0;j<c2;j++)
           {
             temp=mat2[i][j];
             mat2[i][j]=mat2[j][i];
             mat2[i][j]=temp;
             cout<<mat2[j][i];
           } 
        cout<<endl;
      }

}

void matrix::add_matrix()
  {
   cout<<"The addition of matrix is :"<<endl;
   if(r1==r1 && c1==c2)
    {
      for(i=0;i<r1;i++)
        {
         for(j=0;j<c1;j++)
           {
              mat3[i][j]=mat1[i][j]+mat2[i][j];
              cout<<mat3[i][j];
           }
         cout<<endl;        
       }
    }
  else 
   cout<<"Error..!"<<endl; 

  }
void matrix::sub_matrix()
  {
    cout<<"The subtraction of matrix is :"<<endl;
   if(r1==r1 && c1==c2)
    {
      for(i=0;i<r1;i++)
        {
         for(j=0;j<c1;j++)
           {
              mat3[i][j]=mat1[i][j]-mat2[i][j];
              cout<<mat3[i][j];
           }
         cout<<endl;        
       }
    }
  else 
   cout<<"Error..!"<<endl; 

  }
void matrix::mul_matrix()
  {
     cout<<"The multiplication of matrix is :"<<endl;
     for(i=0;i<r1;i++)
        {
         for(j=0;j<c1;j++)
           {
              mat3[i][j]=0;
           }
        }
   if(c1==r2)
    {
      for(i=0;i<r1;i++)
        {
         for(j=0;j<c1;j++)
           {
              for(k=0;k<r1;k++)
              mat3[i][j]=mat3[i][j] + mat1[i][k]*mat2[k][j];
              cout<<mat3[i][j];
           }
         cout<<endl;        
       }
    }
  else 
   cout<<"Error..!"<<endl; 

  }
void matrix::saddle_matrix()
 {
    int small[10],big[10],i,j,max,min;

      for(i=0;i<r1;i++)
        {
          small[i]=mat2[i][0];
        for(j=0;j<c2;j++)
          {
            if(small[i]>mat2[i][j])
             small[i]=mat2[i][j];
         }
      }
     for(j=0;j<c2;j++)
        {
          big[j]=mat2[0][j];
        for(i=0;j<r2;i++)
          {
            if(big[j]<mat2[i][j])
             big[j]=mat2[i][j];
         }
      }
 max=small[0];
      for(j=0;j<c2;j++)
        {
           if(small[j]>max)
             max=small[j];
        }
       min=big[0];
       for(i=0;i<r2;i++)
        {
           if(big[i]<min)
             min=big[i];
        }
     if(max==min)
         cout<<"saddle point exist"<<min;
    else
       cout<<"no saddle point exist";
 }

                      



int main()
 {
   matrix m;
   m.get_matrix();
   m.put_matrix();
   m.add_matrix();
   m.sub_matrix();
   m.mul_matrix();
   m.upper_triangular_matrix();
   m.sum_of_diagonal_elements();
   m.transpose_matrix();
   m.saddle_matrix(); 
return 0; 
  
}

