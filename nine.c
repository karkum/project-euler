#include <stdio.h>
#define N 500
int main()
{
/* doesnt generate all triplets:   
    int a = 3;
    for (; a < 1000; a++)
    {
        int b, c = 0;
        if (a % 2 == 0) // even
        {
            b = (a*a)/4 - 1;
            c = b + 2;
            printf("%d:%d:%d\n", a, b, c);
        }
        else
        {
            b = (a*a)/2 - (1/2);
            c = b + 1;
        }
        
        if (a + b + c == 1000) 
        {
            printf("%d\n", a*b*c);
            break;
        }
    }
    */
    //brute force:
    int a, b, c = 0;
    for (a = 0; a < N; a++) {
        for (b = a + 1; b< N; b++) {
            for (c = b + 1; c < N; c++) {
                if (a + b + c == 1000 && (a*a)+(b*b)==(c*c)) {
                    printf("%d:%d:%d=%d\n", a, b, c, a+b+c);
                    printf("%d\n", a*b*c);
                    goto f;
                }
            }
        }
    }
f: 
    printf("");
}
 
