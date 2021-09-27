//Question 1

import java.util.*;
class Location
{
    double maxval;
    int row;
    int col;
    Location(double x, int r, int c)
    {
        maxval=x;
        row=r;
        col=c;
    }
    
    public static Location locateLargest(double[][] a)
    {
        Location ob=new Location(0,0,0);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]>ob.maxval)
                {
                    ob.maxval=a[i][j];
                    ob.row=i;
                    ob.col=j;
                }
            }
        }
        return ob;
    }
}

class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        double arr[][]=new double[r][c];
        System.out.println("Enter elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextDouble();
            }
        }
        Location ob=Location.locateLargest(arr);
        System.out.println("Largest value: "+ob.maxval);
        System.out.println("Row: "+ob.row);
        System.out.println("Column: "+ob.col);
    }
}