#include <stdio.h>
char* stringcat(char*,char*);
int main(void) {
    
    char a[]="sahil";
    char b[]="sagar";
	char* p=stringcat(a,b);
	printf("%s",p);
	return 0;
}

char* stringcat(char s[],char t[])
{
    int p=0;
    int i;
        while(s[p]!='\0')
        {
            p++;
        }
       while((t[i])!='\0')
       {
           s[p+i]=t[i];
           i++;
       }
       return s;
}
