#include<iostream>
#include<conio.h>
 

using namespace std;
 
char result[10]={' ','1','2','3','4','5','6','7','8','9'};
char verify[10]={' ','1','2','3','4','5','6','7','8','9'};

void display()
{
 system("cls");
	cout << "\n\n\tTic Tac Toe\n\n";

	cout << "Player 1 (X)  -  Player 2 (O)" << endl << endl;
	cout << endl;

	cout << "       |       |     " << endl;
	cout << "       |       |     " << endl;
	cout << "   " << result[1] << "   |   " << result[2] << "   |   " << result[3] << endl;
	cout << "       |       |     " << endl;
	cout << "_______|_______|________" << endl;
	cout << "       |       |     " << endl;
	cout << "       |       |     " << endl;
	cout << "   " << result[4] << "   |   " << result[5] << "   |   " << result[6] << endl;
	cout << "       |       |     " << endl;
	cout << "_______|_______|_____" << endl;
	cout << "       |       |     " << endl;
	cout << "       |       |     " << endl;
	cout << "   " << result[7] << "   |   " << result[8] << "   |   " << result[9] << endl;
	cout << "       |       |     " << endl;
	cout << "       |       |     " << endl << endl;

}

int decideWinner()
{
	if (result[1] == result[2] && result[2] == result[3])
		return 1;
	else if (result[4] == result[5] && result[5] == result[6])
		return 1;
	else if (result[7] == result[8] && result[8] == result[9])
		return 1;
	else if (result[1] == result[4] && result[4] == result[7])
		return 1;
	else if (result[2] == result[5] && result[5] == result[8])
		return 1;
	else if (result[3] == result[6] && result[6] == result[9])
		return 1;
	else if (result[1] == result[5] && result[5] == result[9])
		return 1;
	else if (result[3] == result[5] && result[5] == result[7])
		return 1;
	else if (result[1] != '1' && result[2] != '2' && result[3] != '3' &&
	         result[4] != '4' && result[5] != '5' && result[6] != '6' &&
            result[7] != '7' && result[8] != '8' && result[9] != '9')
		return 0;
	else
		return -1;
}
void Positionselector()
{	int n;
	int player=1,i=-1;
	char mark; 
	do
	{  
		display();
		 player=(player%2)?1:2;

		cout << "Player " << player << ", enter a number:  ";
		cin >> n;

		mark=(player == 1) ? 'X' : 'O';
		 if(result[n] != verify[n])
		{
				cout<<"Invalid move ";
				
			player--;
			cin.ignore();
			cin.get();
		}
		for(int k=1;k<10;k++)
		{
		if (n == k && result[k] == verify[k])

			result[k] = mark;
		}
		

		player++;display();
		i=decideWinner();
		 
	}while(i==-1);
	display();
	if(i==1)

		cout<<"==>\aPlayer "<<--player<<" win ";
	else
		cout<<"==>\aGame draw";
	


	///reset array result
	for(int i=0;i<10;i++)
	{
	   result[i]=verify[i];
	}
}


void main()
{	
	char ch;
	bool endofgame;
	
	 cout<<"Tic Tac Toe "<<endl;
	 cout<<"Press Y/y to Begin the game or Else N/n to end...."<<endl;
	 cin>>ch;
	 endofgame=false;
	 while(ch=='y' || ch=='Y')
	 { 
		 Positionselector();
			cout<<"\n\nDo you want to continue (y for yes) or else"	 <<endl;
			cin>>ch;
	 }
	 

	  

  getch();
}
