import java.util.*;
class Division{
    Scanner scan = new Scanner(System.in);
    public void Num(){
        System.out.println("Enter two numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        float ans = (float)a/b;
        System.out.println("The answer is: "+ans);
    }
}

public class Test {
    public static void main(String[]args){
        Division d = new Division();
        try {
            d.Num();
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
