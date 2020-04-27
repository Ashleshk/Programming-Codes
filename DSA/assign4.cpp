/*#include<iostream>
using namespace std;
class node 
  { 
    public:
    int prn;
    string name;
    node *next;
 
       node (int x,string nm)
         {
            prn=x;
            next=NULL;
            name=nm;
         }         

  };
class list
  {
    node *head;
    public:
        list()
          {
             head=NULL;
          } 
       void create();
       void add_members();
       void display();
       void add_president();
       void add_secretory();
       void del_president();
       void del_secretory();
       void count();
       bool revdisplay() 
        {
          if(head==NULL) 
            return false;
          node *temp;
           temp=head;
          reverse(temp);
          return true;
        }
       void reverse(node *p);
       void concatenate(list &q1 );
       void sorting();
  };
void list::create()
  {
     int no;
     string nam;
       if(head==NULL)
           {
             cout<<"Enter the PRN no"<<endl;
             cin>>no;
             cout<<"Enter the name "<<endl;
             cin>>nam;
             head= new node(no,nam);
           }
       else
          {
             cout<<"List is created"<<endl;
          }
  }
void list::display()
  {
      node *t;
       t=head;
         if(t==NULL)
           {
              cout<<"List is empty"<<endl;
           }
         else
           {
                 cout<<"*****************LIST********************"<<endl;
                  cout<<"PRN \t NAME"<<endl;
             while(t!=NULL)
                {
                 
                  cout<<t->prn<<"\t"<<t->name<<endl;
                  t=t->next;
                }
           }
  }
void list:: add_members()
 {
     int prev_no;
       cout<<"Enter the prev no"<<endl;
       cin>>prev_no;
     int no;
     string nam;   
       node *temp;
       temp=head;
         if(head==NULL)
             {
                create();
             }  
         else
              {
                 while(temp!=NULL)
                     {
                         if(temp->prn==prev_no)
                           {
                             node *p;
                               cout<<"Enter the prn no"<<endl;
                               cin>>no;
                               cout<<"Enter the name"<<endl;
                               cin>>nam;
                               p=new node(no ,nam);
                               p->next=temp->next;
                               temp->next=p;
                           }
                         temp=temp->next;
                     }
              } 
 
 }
void list::add_president()
   {
        int no;
        string nam;
        
        if(head==NULL)
          {
              node *t;
               cout<<"Enter the prn no"<<endl;
               cin>>no;
               cout<<"Enter the name"<<endl;
               cin>>nam;
               t=new node(no ,nam);
               t=head;         
          }
       else
           { 
             node *np;
              
              cout<<"Enter the prn no"<<endl;
               cin>>no;
               cout<<"Enter the name"<<endl;
               cin>>nam;
               np=new node(no ,nam);
               np->next=head;
               head = np;
             
       }
   }
void list::add_secretory()
   {
      int no;
      string nam;
      if(head==NULL)
          {
              node *t;
               cout<<"Enter the prn no"<<endl;
               cin>>no;
               cout<<"Enter the name"<<endl;
               cin>>nam;
               t=new node(no ,nam);
               t=head;         
          }
       else
          {
            node *temp ,*s;
             s=head;
             
              cout<<"Enter the prn no"<<endl;
               cin>>no;
               cout<<"Enter the name"<<endl;
               cin>>nam;
               temp=new node(no ,nam);
                while(s->next!=NULL)
                 {
                   s=s->next;
                 } 
               s->next=temp;
               temp->next=NULL;

          }

   }
void list::del_president()
   {
     if(head==NULL)
       {
          cout<<"List is empty"<<endl;
       }
     else
       {
          node *temp;
          temp=head;
          head=temp->next;
          delete temp;
    
       }

   }
void list::del_secretory()
   {
       if(head==NULL)
       {
          cout<<"List is empty"<<endl;
       }
      else
       {
          node *s,*t;
          s=head;
           while(s->next!=NULL)
             {
                
                t=s;
                s=s->next; 
             }             
           t->next=NULL;
            delete s;
       }

   }
void list::count()

  {   int count=0;
        node *s;
        s=head; 
          while(s!=NULL)
            {
               
               s=s->next;
               count++; 
            }
       cout<<"total no of members in a list are:"<<count<<endl;
  }
void list::reverse(node *p)
  {
       
      if(p==NULL)          
        {
           return;
        }
      else
        {
           reverse(p->next);
           cout<<p->prn<<"\t"<<p->name<<endl;
            
        } 
        
  }
void list::concatenate(list &q1)
{
  node *t, *p;
  t=q1.head;
   if(t==NULL)
     {
        cout<<"List 2 is empty"<<endl;
        return;
     }
  p=head;
    while(p->next!=NULL)
     {
        p=p->next; 
     }
   p->next=t;
   q1.head=NULL;
   cout<<"concatenated list is :"<<endl;
   display();

}
void list::sorting()
{
  
	node *i,*j,*last=NULL,*t;
	int tprn;
	string tname;
        t=head;
      if(t==NULL)
        {
	 cout<<"\nList is empty.";
	 return ;
        }
       for(i=t;i->next!=NULL;i=i->next)
         {
	   for(j=t;j->next!=last;j=j->next)
	       {
		 if((j->prn)>(j->next->prn))
		   {
			tprn=j->prn;
			tname=j->name;
			j->prn=j->next->prn;
			j->name=j->next->name;

			j->next->prn=tprn;
			j->next->name=tname;
		   }
	}
}
cout<<"\n List is sorted.";
display();
   

}

int main()
  {
    list *l;
     int choice,selectlist;
     list l1,l2;
     l=&l1;
    x:cout<<"select the list 1:List 1\n 2:List 2"<<endl;
      cin>>selectlist;
       if(selectlist==1)
          {
              l=&l1;
          }
       else

       {
         if(selectlist==2) 
           {
              l=&l2;
           }
         else
           {
            cout<<"wrong choice"<<endl;
            goto x;
           }
       }
       cout<<"1:create\n2:display\n3:add member\n4:add president\n5:add secretory\n6:delete president\n7:delete secretory\n8:count total no of elemetns in list\n9:display list in reverse\n10:select list\n11:concatenate list\n12:sorting of list"<<endl; 
    do
      {
     
     cout<<"Enter the choice"<<endl;
       cin>>choice;
         switch(choice)
            {
               case 1:  l->create();
                        break; 
               case 2 : l->display();
                        break; 
               case 3:  l->add_members();
                        break; 
               case 4:  l->add_president();
                        break; 
               case 5:  l->add_secretory();
                        break; 
               case 6:  l->del_president();
                        break; 
               case 7:  l->del_secretory();
                        break;
               case 8: l->count();
                        break;
               case 9:  cout<<"PRN \t NAME"<<endl;
                        l->revdisplay();
                        break;
               case 10: goto x;
                        break;
               case 11: l1.concatenate(l2);
                        break; 
               case 12: l->sorting();  
                       break;
           }
      }while(choice<13);
    

     return 0;
  } 
*/


