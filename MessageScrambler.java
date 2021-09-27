interface MessageScrambler
{
    String encode(String plainText);
}

class SubstitutionScrambler implements MessageScrambler
{
    int shift;
    SubstitutionScrambler(int shift)
    {
        this.shift=shift;
    }

    public String encode(String plainText)
    {
        plainText=plainText.toUpperCase();
        String k="";
        for(int i=0;i<plainText.length();i++)
        {
            k+=(char)((((plainText.charAt(i)-65)+shift)%26)+65);
        }
        return k;
    }

}

class ShuffleScrambler implements MessageScrambler
{
    int n;
    ShuffleScrambler(int n)
    {
        this.n=n;
    }

    private String scramble(String plainText)
    {
        String k="";
        for(int i=0, j=plainText.length()/2;i<plainText.length()/2;i++, j++)
        {
            k+=""+plainText.charAt(i)+plainText.charAt(j);
        }
        return k;
    }

    public String encode(String plainText)
    {
        for(int z=0;z<n;z++)
        {
            plainText=scramble(plainText);
        }
        return plainText;
    }
}

class ScramblerTest
{
    public static void main(String args[])
    {
        String clrtxt="Aditya";
        int n=3;
        String s1=new SubstitutionScrambler(n).encode(clrtxt);
        String s2=new ShuffleScrambler(n).encode(clrtxt);
        System.out.println(s1+"\n"+s2);
    }
}