package Interface;
class Test{
    String name;
    public Test(String name){
        this.name=name;
    }
    public String toString(){
        return this.name+" is running";
    }
}

public class Example {
    public static void main(String [] args){
        Test t = new Test("BMW");
        System.out.print(t);
    }
}
