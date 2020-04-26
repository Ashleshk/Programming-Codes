 
#include <stdio.h>
 
#define MAXDIGS		10+1			 
#define NMULS		5		
							
 
typedef struct mul {
	unsigned long val;				 
	char sval[ MAXDIGS ];				 
}Mul;
 

int s_isanagram(const char *s, const char *t)
{
	int val, hgram[256] = {0};			
	const char *ps=s, *pt=t;			
 
	if ( !s || !t )					
		return 0;
 
	for (; *s || *t; ) {				
		if ( *s )				
			hgram[(int)(*s++)]++;		 
		if ( *t )				// ...
			hgram[(int)(*t++)]--;		 
	}
							 
	while( *ps && *pt++ && !(val=hgram[(int)(*ps++)]) )	 
		;					 
	return val || *pt ? 0 : 1;			 
 
}
 
int set_muls( unsigned long n, Mul muls[] )
{
	register int i=2, nchars;
 
	for (i=2; i < NMULS+2; i++)
	{
		muls[i-2].val = i * n;				 
		nchars = printf(				 
				muls[i-2].sval, MAXDIGS, "%lu", muls[i-2].val );
		if (nchars >= MAXDIGS)
			return 0;
	}
 
	return 1;
}
 
int muls_anagrams( Mul muls[] )
{
	int is_anagram = 1;					 
	register int i;
	for (i=1; is_anagram && i < NMULS; i++) {
		is_anagram = is_anagram && s_isanagram( muls[0].sval, muls[i].sval );
	}
 
	return is_anagram;
}
 
void print_muls( Mul muls[] )
{
	register int i;
 
	printf("muls of %lu: \n", muls[0].val/2 );
	for (i=0; i < NMULS; i++)
		printf("\t%dx = %lu\n", i+2, muls[i].val );
	putchar('\n');
 
	return;
}
 
int main( void )
{
	unsigned long i;
	Mul muls[ NMULS ] = {{0,NULL}};			 
 
	int are_anagrams = 0;				 
	for (i=1; !are_anagrams; i++)			 
	{
		if ( !set_muls(i, muls ) ) {		 
			printf("*** error: a multiple of %lu too big to have an sval", i);
			return 1;
		}
		are_anagrams = muls_anagrams( muls );	 
	}
 
	print_muls( muls );
 
	return 0;
}
 