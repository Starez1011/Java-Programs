package Composition;
class Storage{
    int size;
    public Storage(int size){
        this.size=size;
    }
    public String toString(){
        return "Size: "+this.size;
    }
}
class Computer{
    String name;
    Storage str;
    public Computer(String name,Storage str){
        this.name=name;
        this.str=str;
    }
    public String toString(){
        return "Name: "+this.name+" and "+this.str;
    }
}
public class Test {
    public static void main(String [] args){
        Storage s = new Storage(256);
        Computer c = new Computer("DELL",s);
        System.out.println(c);
    }
}
