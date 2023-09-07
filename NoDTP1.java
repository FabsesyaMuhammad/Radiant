import java.util.Scanner;

/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculator
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Constructor for objects of class calculator
     */
    public calculator()
    {
        // initialise instance vari
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int Penjumlahan()
    {
        // put your code here
        return x + y;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input nilai X");
        double x = input.nextDouble();
        
        System.out.println("Input nilai Y");
        double y = input.nextDouble();
        
        System.out.println("x+y= "+(x+y));
        System.out.println("x-y= "+(x-y));
        System.out.println("x*y= "+(x*y));
        System.out.println("x/y= "+(x/y));

    }
    
}
