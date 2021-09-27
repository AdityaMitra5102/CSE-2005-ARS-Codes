class Division
{
    String name;
    String id;
    
    Division(String name, String id)
    {
        this.name=name;
        this.id=id;
    }
    
    void display()
    {
        System.out.print(id+"\t"+name);
    }
}

class InternationalDivision extends Division
{
    String location;
    String language;
    
    InternationalDivision(String nm, String id, String loc, String lang)
    {
        super(nm,id);
        location=loc;
        language=lang;
    }
    
    void display()
    {
        super.display();
        System.out.println(" \t"+location+"\t"+language);
    }
}

class DomesticDivision extends Division
{
    String location;
    String language;
    
    DomesticDivision(String nm, String id, String loc, String lang)
    {
        super(nm,id);
        location=loc;
        language=lang;
    }
    
    void display()
    {
        super.display();
        System.out.println(" \t"+location+"\t"+language);
    }
}

class Company
{
    String name;
    Division div[];
    
    Company(String nm, Division arr[])
    {
        name=nm;
        div=arr;
    }
    
    public void display()
    {
        for(int i=0;i<div.length;i++)
        {
            System.out.print(name+"\t");
            div[i].display();
        }
        
    }
}

class TestDivision
{
    public static void main(String args[])
    {
        Division d1=new InternationalDivision("Div1","1","US","EN_US");
        Division d2=new DomesticDivision("Div2","2","Delhi","HIN");
        Division d3=new InternationalDivision("Div3","3","Spain","ESP");
        Division d4=new DomesticDivision("Div4","4","WB","BEN");
        Company c1=new Company("ABC",new Division[]{d1,d2});
        Company c2=new Company("XYZ",new Division[]{d2,d3});
        
        System.out.println("Company Name\tDivision Id\tDivision Name\tDivison Location\tLanguage");
        c1.display();
        c2.display();
    }
}