#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#include <string.h>  

char answer;
char answer2;
char answer3;

int logo(){
  printf("   _____       _____            __ _      \n ");
  printf(" / ____|     / ____|          / _| |      \n ");
  printf("| |   ______| |     _ __ __ _| |_| |_     \n ");
  printf("| |  |______| |    | '__/ _` |  _| __|    \n ");
  printf("| |____     | |____| | | (_| | | | |_     \n ");
  printf(" \\_____|     \\_____|_|  \\__,_|_|  \\__|\n ");
                                       
}


int dlbeta(){
        printf("Donwloading files.");
        Sleep(100);
        printf(".");
        Sleep(100);
        printf(".");
        Sleep(100);
        printf(".");
        system("cd lib && java -cp dllib.jar Main");
}

int dlclassic(){
        printf("Donwloading files.");
        Sleep(100);
        printf(".");
        Sleep(100);
        printf(".");
        Sleep(100);
        printf(".\n");
        system("cd lib && java -cp dllib-classic.jar MainClassic");
}


int main()
{
    char runargs[] = "";
    char runb[] = "java  -Djava.library.path=lib -Dhttp.proxyHost=betacraft.uk -Djava.util.Arrays.useLegacyMergeSort=true -Xmx1024M -cp lib\\lwjgl.jar;lib\\lwjgl_util.jar;lib\\jinput.jar;lib\\minecraft.jar net.minecraft.client.Minecraft ";
    char runc[] = "java  -Djava.library.path=lib -Dhttp.proxyHost=betacraft.uk -Djava.util.Arrays.useLegacyMergeSort=true -Xmx1024M -cp lib\\lwjgl.jar;lib\\lwjgl_util.jar;lib\\jinput.jar;lib\\minecraft.jar com.mojang.minecraft.Start ";
    logo();
    printf("-=Welcome to C-Craft made by:Maxxx#5509=-\n");
    printf("what do you want to do:\n");
    printf("-----------------------\n");
    printf("[r=run] [d=download files] [q=quit]\n");
    printf("answer here: ");
    scanf(" %c",&answer);
    if (answer == 'd')
    {
        printf("beta[b] or classic[c]?:");
        scanf(" %c",&answer2);
        if (answer2 == 'b')
        {
            dlbeta();
            main();
        }
        if (answer2 == 'c')
        {
            dlclassic();
            main();
        }
    }
    if (answer == 'r')
            printf("beta[b] or classic[c]?:");
            scanf(" %c",&answer2);
        if (answer2 == 'b')
        {
            printf("enter username and mppass(with space between mpass optional): ");
            scanf("%s", &runargs);        
            strcat(runb,runargs);
            system(runb);
        }
        if (answer2 == 'c')
        {
            printf("enter username and mppass(with space between mpass optional): ");
            scanf("%s", &runargs);        
            strcat(runc,runargs);
            system(runc);
        }
    {
    }
    if (answer == 'q')
    {
        return -1;
    }


    return 0;
}