//Question 4

class Animal
{
    void hop()
    {
        System.out.println("Animal hop");
    }
    void reproduce()
    {
        System.out.println("Animal reproduce");
    }
    void run()
    {
        System.out.println("Animal run");
    }
}

class Mouse extends Animal
{
    void hop()
    {
        System.out.println("Mouse hop");
    }
    void reproduce()
    {
        System.out.println("Mouse reproduce");
    }
    void run()
    {
        System.out.println("Mouse run");
    }
}

class Dog extends Animal
{
    void hop()
    {
        System.out.println("Dog hop");
    }
    void reproduce()
    {
        System.out.println("Dog reproduce");
    }
    void run()
    {
        System.out.println("Dog run");
    }
}

class Cat extends Animal
{
    void hop()
    {
        System.out.println("Cat hop");
    }
    void reproduce()
    {
        System.out.println("Cat reproduce");
    }
    void run()
    {
        System.out.println("Cat run");
    }
}

class Test
{
    public static void main(String args[])
    {
        Animal arr[]=new Animal[4];
        arr[0]=new Animal();
        arr[1]=new Mouse();
        arr[2]=new Dog();
        arr[3]=new Cat();
        
        for(int i=0;i<4;i++)
        {
            System.out.println("Element "+i);
            arr[i].hop();
            arr[i].reproduce();
            arr[i].run();
        }
    }
}