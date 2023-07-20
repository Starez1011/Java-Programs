class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}
class Student{
    String name;
    int sem;
    public Student(String name,int sem)throws MyException{
        if(sem<1||sem>8){
            throw new MyException("Semester must be between 1 & 8");
        }
        this.name=name;
        this.sem=sem;
    }
    public void getMsg(){
        System.out.print("Name: "+this.name+" Semester: "+this.sem);
    }
}
class Test{
    public static void main(String[]args) {
        try{
            Student s = new Student("Ram",7);
            s.getMsg();
        }
        catch(MyException e){
            System.out.print(e.getMessage());
        }
    }
}