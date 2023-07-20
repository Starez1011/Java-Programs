import java.util.*;

class Storage{
    int[] arr = new int[10];
    int i;
    Scanner scan = new Scanner(System.in);
    public void getNum(){
        for(i=0;i<arr.length;i++){
            System.out.println("Enter "+ i + " elements: ");
            arr[i]=scan.nextInt();
        }
    }
    public void showNum(){
        System.out.println("Array Elements are: ");
        for(i=0;i<arr.length;i++){
            System.out.print(" "+ arr[i]);
        }
    }
    public void removeNum(){
        int Num;
        System.out.println("Enter number to delete from array: ");
        Num=scan.nextInt();
        for(i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.println("New Array Elements are: ");
                for(i=0;i<arr.length-1;i++){
                System.out.print(" "+ arr[i]);
                }
                break;
            }
            if(i>=Num){
                arr[i]=arr[i+1];
            }
        }
    }
}


class Test2{
    public static void main(String[] args){
        Storage s = new Storage();
        try{
            s.getNum();
            s.showNum();
            s.removeNum();
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
