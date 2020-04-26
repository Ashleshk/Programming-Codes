#include <stdio.h>
#include<conio.h>
int main() {
    int i_ = 2, *j_, k_;
    j_ = &i_;
    printf("%d\n", i_**j_*i_+*j_);
    getch();
} 