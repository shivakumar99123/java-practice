class Student{
    String name;
    int age;
    Student(){
         
        
    }
    Student(String name){
        this.name=name;
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name+" "+age);
    }

} 
class over{
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student("shiva");
        Student s3=new Student("shiva",18);
        s1.display();
        s2.display();
        s3.display();
    }
}

    

