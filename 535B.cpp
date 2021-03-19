#include <cstdio>
#include <iostream>
#include <algorithm>
using namespace std;
main()
{
    int n;
    scanf("%d",&n);
    int list[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&list[i]);
    }
    sort(list,list+n);
//    for(int i=0;i<n;i++)
//    {
//        printf("%d ",list[i]);
//    }
    printf("%d ",list[n-1]);
    for(int i=n-1;i>=0;i--)
    {
        if(list[n-1]%list[i]!=0)
        {
            printf("%d",list[i]);
            break;
        }
        else if(list[i]==list[i-1])
        {
            printf("%d",list[i]);
            break;
        }
    }
}
