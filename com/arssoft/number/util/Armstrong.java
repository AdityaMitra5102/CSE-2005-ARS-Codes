package com.arssoft.number.util;
public class Armstrong
{
    public static boolean armstrong(int n)
    {
        int len=(int)Math.log10(n)+1;
        int sum=0;
        int copy=n;
        while(copy>0)
        {
            sum+=(int)Math.pow(copy%10,len);
            copy/=10;
        }
        return sum==n;
    }
}