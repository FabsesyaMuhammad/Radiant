import java.util.Scanner;

public class calculator
{
    
    private int x;
    private int y;

   
    public calculator()
    {

    public int Penjumlahan()
    {
        // put your code here
        return x + y;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input nilai X = ");
        double x = input.nextDouble();
        
        System.out.println("Input nilai Y = ");
        double y = input.nextDouble();
        
        System.out.println("x+y= "+(x+y));
        System.out.println("x-y= "+(x-y));
        System.out.println("x*y= "+(x*y));
        System.out.println("x/y= "+(x/y));

    }
    
}
}
