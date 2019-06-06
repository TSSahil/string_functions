/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include <string.h>


void reverseString(char[]);


int main(void) {
    
   char a[]="sahil";

   reverseString(a);

	return 0;
}

void reverseString(char a[])
{
    char c;
    int i,j;
    for(i=0,j=strlen("sahil")-1;i<j;i++,j--)
    {
        c=a[i];
        a[i]=a[j];
        a[j]=c;
    }
    printf("%s",a);

}

