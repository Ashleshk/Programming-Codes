/* =========================================================
 * Project Euler, Problem #52
 *
 * It can be seen that the number, 125874, and its double, 251748, contain exactly
 * the same digits, but in a different order.
 *
 * Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain
 * the same digits.
 *
 * Solution by: migf1
 * =========================================================
 */
#include <stdio.h>
 
#define MAXDIGS		10+1				// max allowed digits in a num
#define NMULS		5				// # of consecutive multiples
							// (5 means 2x, 3x, 4x, 5x, 6x)
 
typedef struct mul {					// structure for a multiple
	unsigned long val;				// numeric value
	char sval[ MAXDIGS ];				// converted to c-string
}Mul;
 
// ---------------------------------------------------------------------------------
// Function: s_isanagram
// 	Return TRUE if c-string s is an angaram of c-string t, FALSE otherwise
//
int s_isanagram(const char *s, const char *t)
{
	int val, hgram[256] = {0};			// init histogram for the ASCII table
	const char *ps=s, *pt=t;			// temp char pointers to s & t
 
	if ( !s || !t )					// early exit
		return 0;
 
	for (; *s || *t; ) {				// update histogram
		if ( *s )				// ...
			hgram[(int)(*s++)]++;		// ... +1 for every char in s
		if ( *t )				// ...
			hgram[(int)(*t++)]--;		// ... -1 for every char in t
	}
							// check in histogram for
	while( *ps && *pt++ && !(val=hgram[(int)(*ps++)]) )	// 1st non-zero mapped val
		;					// of all chars in s
	return val || *pt ? 0 : 1;			// val || *pt != 0 ? FALSE : TRUE
 
}
// ---------------------------------------------------------------------------------
// Function: set_muls
// 	Put NMULS consecutive multiples of n into the muls array, starting from 2x.
// 	Return FALSE if the numerical value of a multiple consists of more than MAXDIGS-1
// 	digits, so it cannot get stored into its c-string counterpart (sval).
//
int set_muls( unsigned long n, Mul muls[] )
{
	register int i=2, nchars;
 
	for (i=2; i < NMULS+2; i++)
	{
		muls[i-2].val = i * n;				// numerical value
		nchars = printf(				// converted to c-string
				muls[i-2].sval, MAXDIGS, "%lu", muls[i-2].val );
		if (nchars >= MAXDIGS)
			return 0;
	}
 
	return 1;
}
// ---------------------------------------------------------------------------------
// Function: muls_anagrams:
// 	Return TRUE if all multiples inside muls are anagrams of each other,
//	FALSE otherwise
//
int muls_anagrams( Mul muls[] )
{
	int is_anagram = 1;					// TRUE
	register int i;
	for (i=1; is_anagram && i < NMULS; i++) {
		is_anagram = is_anagram && s_isanagram( muls[0].sval, muls[i].sval );
	}
 
	return is_anagram;
}
// ---------------------------------------------------------------------------------
void print_muls( Mul muls[] )
{
	register int i;
 
	printf("muls of %lu: \n", muls[0].val/2 );
	for (i=0; i < NMULS; i++)
		printf("\t%dx = %lu\n", i+2, muls[i].val );
	putchar('\n');
 
	return;
}
// ---------------------------------------------------------------------------------
int main( void )
{
	unsigned long i;
	Mul muls[ NMULS ] = {{0,NULL}};			// important initialization to 0s
 
	int are_anagrams = 0;				// bool to control the basic loop
	for (i=1; !are_anagrams; i++)			// our basic loop
	{
		if ( !set_muls(i, muls ) ) {		// produce NMULS multiples of i
			printf("*** error: a multiple of %lu too big to have an sval", i);
			return 1;
		}
		are_anagrams = muls_anagrams( muls );	// are all multiples anagrams ?
	}
//	printf("%lu\n", i-1);
	print_muls( muls );
 
	return 0;
}
 