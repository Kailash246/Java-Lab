interface Employee1{
    void employee1_det();
}
interface Employee2{
    void employee2_det();
}
interface Employee3{
    void employee3_det();
}
interface Employee4{
    void employee4_det();
}
interface Employee5{
    void employee5_det();
}
class Emp1 implements Employee1{
    public void employee1_det(){
        System.out.println("Employee 1 details");
        System.out.println("------------------");
        System.out.println("Emp id: 0001");
        System.out.println("Emp name: Alyce");
        System.out.println("Emp salary: 90k/month");
        System.out.println("Emp location: Bengaluru");
        System.out.println("Emp company: FestNest");
    }
}
class Emp2 implements Employee2{
    public void employee2_det(){
        System.out.println("------------------");
        System.out.println("Employee 2 details");
        System.out.println("------------------");
        System.out.println("Emp id: 0002");
        System.out.println("Emp name: John");
        System.out.println("Emp salary: 1 lakh/month");
        System.out.println("Emp location: Bengaluru");
        System.out.println("Emp company: GoCartz");
    }
}
class Emp3 implements Employee3{
    public void employee3_det(){
        System.out.println("------------------");
        System.out.println("Employee 3 details");
        System.out.println("------------------");
        System.out.println("Emp id: 0003");
        System.out.println("Emp name: Dilip");
        System.out.println("Emp salary: 80k/month");
        System.out.println("Emp location: Bengaluru");
        System.out.println("Emp company: shop4au");
    }
}
class Emp4 implements Employee4{
    public void employee4_det(){
        System.out.println("------------------");
        System.out.println("Employee 4 details");
        System.out.println("------------------");
        System.out.println("Emp id: 0004");
        System.out.println("Emp name: Tim");
        System.out.println("Emp salary: 1.5 lakh/month");
        System.out.println("Emp location: Bengaluru");
        System.out.println("Emp company: Tocline");
    }
}
class Emp5 implements Employee5{
    public void employee5_det(){
        System.out.println("------------------");
        System.out.println("Employee 5 details");
        System.out.println("------------------");
        System.out.println("Emp id: 0005");
        System.out.println("Emp name: Sandeep");
        System.out.println("Emp salary: 2 lakh/month");
        System.out.println("Emp location: Bengaluru");
        System.out.println("Emp company: Mali Pvt.ltd");
    }
}
class employee_details_using_multiple_interfaces_in_java {
    public static void main(String args[]){
        Emp1 obj1=new Emp1();
        obj1.employee1_det();
        Emp2 obj2=new Emp2();
        obj2.employee2_det();
        Emp3 obj3=new Emp3();
        obj3.employee3_det();
        Emp4 obj4=new Emp4();
        obj4.employee4_det();
        Emp5 obj5=new Emp5();
        obj5.employee5_det();
    }
}