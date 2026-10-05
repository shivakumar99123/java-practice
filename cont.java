class Employee{
    String name;
    int id;
    float salary;
    String department;
    Employee(String name,int id,float salary,String department){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.department=department;

    }
    void display(){
        System.out.println(name+" "+id+" "+salary+" "+department);
    }
}
class cont{
    public static void main(String[] args){
        Employee e1=new Employee("Shiva",197,230000,"developer");
        Employee e2=new Employee("aleena",198,234393,"developer");
        e1.display();
        e2.display();
    }
}
