#include <stdio.h>
char answerdl;
int main()

{
    printf("-=Weclome to C-Craft");
    printf("Do you wana download files yes or no?");
    scanf(" %c",&answerdl);
    if (answerdl == 'y')
    {
        printf("Donwloading files");
    }
        if (answerdl == 'n')
    {
        printf("placeholder");
    }


    return 0;
}