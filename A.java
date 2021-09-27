//Question 3

interface A
{
    int varA=1;
    void funcA();
}

interface E extends A
{
    int varE=2;
    void funcE();
}

interface F extends A
{
    int varF=3;
    void funcF();
}

interface Z extends E,F
{
    int varZ=4;
    void funcZ();
}

class Q implements Z
{
    public void funcA()
    {
        System.out.println(varA);
    }
    public void funcE()
    {
        System.out.println(varE);
    }
    public void funcF()
    {
        System.out.println(varF);
    }
    public void funcZ()
    {
        System.out.println(varZ);
    }
}

class Test
{
    public static void main(String args[])
    {
       Q ob =new Q();
       ob.funcA();
       ob.funcE();
       ob.funcF();
       ob.funcZ();
    }
}