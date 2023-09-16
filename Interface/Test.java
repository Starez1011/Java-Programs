//Example for inheritance

package Interface;
interface car{
    public static void run(){

    }
}
class Start implements car{
    String name;
    public Start(String name){
        this.name=name;
    }
    public void run(){
        System.out.print(this.name+" is running.");
    }
}

class Test{
    public static void main(String [] ars){
        Start s = new Start("BMW");
        s.run();
    }
}
