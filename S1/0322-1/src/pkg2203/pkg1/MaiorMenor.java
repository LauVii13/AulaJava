package pkg2203.pkg1;

public class MaiorMenor {
    
    public static int Comp2(int a, int b)
    {
        if(a>=b){
            return a;
        }
        return b;
    }
    
    public static int Comp3(int a, int b, int c)
    {
        int ab = Comp2(a, b);
        
        if(ab>=c){
            return ab;
        }
        return c;
    }
    
    public static int Comp4(int a, int b, int c, int d)
    {
        int abc = Comp3(a, b, c);
        
        if(abc>=d){
            return abc;
        }
        return d;
    }
    
    public static int Comp5(int a, int b, int c, int d, int e)
    {
        int abcd = Comp4(a, b, c, d);
        
        if(abcd>=e){
            return abcd;
        }
        return e;
    }
}
