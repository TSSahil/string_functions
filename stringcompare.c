#include <stdio.h>
int stringcat(char*,char*);
int main(void) {
    
    char a[]="sahil";
    char b[]="sagar";
	int p=stringcam(a,b);
	printf("%d",p);
	return 0;
}

int stringcam(char s[],char t[])
{
    for( ;*s==*t;s++,t++)
    {
        if(*s=='\0')
        {
            return 0;
        }
    }
    return *s-*t;
}
