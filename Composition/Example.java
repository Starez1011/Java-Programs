package Composition;
class Storage{
    int size;
    public Storage(int size){
        this.size=size;
    }
    public String display(){
        String d ="Size: "+this.size;
        return d;
    }
}
class Computer{
    String name;
    Storage str;
    public Computer(String name,Storage str){
        this.name=name;
        this.str=str;
    }
    public String display(){
        return "Name: "+this.name+" and " + this.str.display();
    }
}
public class Example{
    public static void main(String [] args){
        Storage s = new Storage(256);
        Computer c = new Computer("DELL",s);
        System.out.print(c.display());
    }
}
