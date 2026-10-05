class Employee{
    String name;
    int id;
    float salary;
    String department;

    void display_details(){
        System.out.println(name+" "+id+" "+salary+" "+department);
    }

}
class Main{
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.name="shiva";
        e1.id=197;
        e1.salary=239990;
        e1.department="CSM";
        Employee e2=new Employee();
        e2.name="aleena";
        e2.id=198;
        e2.salary=234454;
        e2.department="CSE";
        e1.display_details();
        e2.display_details();




    }
}