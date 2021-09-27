package com.arssoft.number.util;
public class Factorial
{
    public static int factorial(int n)
    {
        return n==0?1:n*factorial(--n);
    }
}