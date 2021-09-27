package com.arssoft.number.util;
public class Palindrome
{
    public static boolean palindrome(int n)
    {
        int rev=0, copy=n;
        while(copy>0)
        {
            rev=rev*10+copy%10;
            copy/=10;
        }
        return rev==n;
    }
}