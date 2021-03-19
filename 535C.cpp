#include <cstdio>
#include <iostream>
#include <cstring>
using namespace std;
main()
{
    int n;
    scanf(" %d",&n);
    int y=n;
    //cout << n;
    char lamp[n];
    for(int i=0;i<y;i++)
    {
        cin >> lamp[i];
    }
    char temp[6][4];
    int ans[6]={0};
    strcpy(temp[0],"RGB");
    for(int i=0;i<y;i++)
    {
        if(lamp[i]==temp[0][i%3])
        {
            ans[0]++;
        }
    }
    strcpy(temp[1],"RBG");
    for(int i=0;i<y;i++)
    {
        if(lamp[i]==temp[1][i%3])
        {
            ans[1]++;
        }
    }
    strcpy(temp[2],"GRB");
    for(int i=0;i<y;i++)
    {
        if(lamp[i]==temp[2][i%3])
        {
            ans[2]++;
        }
    }
    strcpy(temp[3],"GBR");
    for(int i=0;i<y;i++)
    {
        if(lamp[i]==temp[3][i%3])
        {
            ans[3]++;
        }
    }
    strcpy(temp[4],"BRG");
    for(int i=0;i<y;i++)
    {
        if(lamp[i]==temp[4][i%3])
        {
            ans[4]++;
        }
    }
    strcpy(temp[5],"BGR");
    cout << n;
    for(int i=0;i<y;i++)
    {
        if(lamp[i]==temp[5][i%3])
        {
            ans[5]++;
        }
    }

    int max=-1,index=0;
    for(int i=0;i<6;i++)
    {
        if(max<ans[i])
        {
            max=ans[i];
            index=i;
        }
    }
    cout << y-max << endl;
    for(int i=0;i<y;i++)
    {
        cout << temp[index][i%3];
    }
}
