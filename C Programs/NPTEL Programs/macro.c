#include<stdio.h>
int func(int, int);

#define func(x, y) x / y + x

int main() {
    int i, j;
    scanf("%d", &i);

    scanf("%d", &j);

     
	printf("%d ", func(i + j, 3)); // Macro call
		#undef func // Macro is no longer defined
	printf("%d\n", func(i + j, 3)); // Function call // Function call// Fill in the blank
     printf("%d\n", func(i + j, 3));

} //End main()
int func(int x, int y)
{

    return y / x + y;

}
