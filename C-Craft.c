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
        Sleep(100);
        printf(".");
        Sleep(100);
        printf(".");
        Sleep(100);
        printf(".");
        system("cd lib && java -cp dllib.jar Main");
        main();
    }
        if (answer == 'r')
        system("java -Djava.library.path=lib -Xmx1024M -cp lib\\lwjgl.jar;lib\\lwjgl_util.jar;lib\\jinput.jar;lib\\minecraft.jar net.minecraft.client.Minecraft -Dhttp.proxyHost=betacraft.uk");
    {
    }
        if (answer == 'q')
    {
        return -1;
    }


    return 0;
}