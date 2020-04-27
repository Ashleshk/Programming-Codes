#include <stdio.h> 
#include <stdlib.h> 
#include <string.h> 
#include <conio.h>
#define MAX_STUDENTS 10 
 
typedef struct { 
char studentNum[20]; 
char lastName[ 15 ]; 
char firstName[ 10 ]; 
char phoneNum[ 15 ]; 
} studentData; 
 
int read_studentRecord( studentData [] ); 
void print_studentRecord( studentData [] ); 
void sort_studentRecord( studentData [], int ); 
void search_studentRecord( studentData [], int );
int delete_studentRecord(studentData details[], int); 
 
// ************************************************** 
//**************************************** 
 
int main() 
 
{ 
int n; 
 
studentData details [MAX_STUDENTS]; //define a structure array of size MAX_STUDENTS 
 
n = read_studentRecord( details ); 
 
sort_studentRecord( details, n ); 
 
print_studentRecord( details ); 
 
search_studentRecord( details, n ); 
 
delete_studentRecord( details, n ); 
 
return 0; 
} 
 
// ************************************************** 
//**************************************** 
 
int read_studentRecord ( studentData details[] ) 
{ 
int i = 0; 
printf( "Enter Student Number (e.g. S00054321, 0 to end input)\n" ); 
scanf( "%s", details[i].studentNum ); 
while ( details[i].studentNum[0] != '0' ) 
{ 
printf (" Enter Last Name:\n?"); 
scanf ( "%s", details[i].lastName ); 
 
printf (" Enter First Name:\n?"); 
scanf ( "%s", details[i].firstName ); 
 
printf (" Enter Phone Number:\n?"); 
scanf ( "%s", &details[i].phoneNum ); 
 
i++; 
 
printf ( "Enter Student Number\n?"); 
scanf ( "%s", details[i].studentNum); 
} 
return i; 
} 
 
// ************************************************** 
//*************************************** 
 
void sort_studentRecord ( studentData details[], int n ) 
{ 
 
studentData hold; 
int i, pass; 
 
for ( pass = 1; pass <= n - 1; pass++ )//number of passes 
for ( i = 0; i <= n - pass -1; i++ )//single pass 
if ( strcmp( details[i].lastName, details[i+1].lastName ) == 1) {//sort in order of last name 
hold = details[i]; 
details[i] = details[i+1];//swap array elements if statement is true 
details[i+1] = hold; 
} 
} 
 
 
// ************************************************** 
//*************************************** 
 
 
void print_studentRecord( studentData details[] ) 
{ 
int i=0; 
system("cls");
 
printf("Sorted by Last Name:\n\n");
 
if (details[0].studentNum != 0) 
printf ("\n%-10s%-16s%-11s%10s\n\n", "Student #", "Last Name", "First Name", "Phone #"); 
 
while ( details[i].studentNum[0] != '0' ) 
{ 
printf("%-10s%-16s%-11s%10s\n", details[i].studentNum, details[i].lastName, details[i].firstName, details[i].phoneNum); 
 
i++; 
 
 
 
} 
printf("\n\n");
printf("Press any key to search for an entry\n");
getch();
} 
 
// ************************************************** 
//*************************************** 
 
  
 
void search_studentRecord( studentData details[], int numOfRec ) 
{ 
int low, high, mid; 
char searchkey[10]; 
int flag = 0; 
printf("Enter a Last Name to search for.\n"); 
scanf("%s", searchkey); 
 
low = 0; 
high = numOfRec; 
 
while (low <= high) { 
mid = (low+high)/2; 
if (strcmp(searchkey, details[mid].lastName) < 0) 
high = mid-1; 
else if (strcmp(searchkey, details[mid].lastName) > 0) 
low = mid + 1; 
else if (strcmp(searchkey, details[mid].lastName) == 0) // found match 
{ 
 
system("cls");
 
printf("Student I.D: %s\nPhone Number: %s\n", details[mid].studentNum, details[mid].phoneNum); 
flag = 1; 
break; 
} 
} 
 
if (!flag) printf("Search Key not found\n"); 
}
//***********************************************************************************************
 
int delete_studentRecord(studentData details[], int NumOfRec)
{
int i; 
char x;//variable to hold the value of the student number to delete
 
int max = sizeof(details); 
 
details[max]=0;//Mark the last record by 0. 
 
printf("Enter a student number of the record you would like to delete:\n");
scanf("&s", x);
 
 
for (i = 0; i < max; i++) if (details[i].studentNum == x) break; 
 
if (i == max) return -1; // The record not found. 
 
for ( ; i < max; i++) details[i] = details[i + 1]; 
 
max--; 
 
return 0; // Successfully deleted record. 
}