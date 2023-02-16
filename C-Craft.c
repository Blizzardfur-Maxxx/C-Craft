#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

char answer;

int main()
{
    printf("-=Weclome to C-Craft made by:Maxxx#5509=-\n");
    printf("what do you want to do:\n");
    printf("-----------------------\n");
    printf("[r=run] [d=download files] [q=quit]\n");
    printf("answer here: ");
    scanf(" %c",&answer);
    if (answer == 'd')
    {
        printf("Donwloading files.");
        Sleep(1000);
        printf(".");
        Sleep(1000);
        printf(".");
        Sleep(1000);
        printf(".");
        system("cd lib && java -cp dllib.jar Main");
    }
        if (answer == 'r')
        printf("running game then");
    {
    }
        if (answer == 'q')
    {
        return -1;
    }


    return 0;
}