//Getter setter
class Company {
    private int empid;
    private String empname;
    private String empcompany;

    public int getID() {
        return empid;
    }

    public String getEmpName() {
        return empname;
    }

    public String getEmpCompany() {
        return empcompany;
    }

    public void setID(int empid) {
        this.empid = empid;
    }

    public void setEmpName(String empname) {
        this.empname = empname;
    }

    public void setEmpCompany(String empcompany) {
        this.empcompany = empcompany;
    }
}

class GetSet {
    public static void main(String[] args) {
        Company c = new Company();

        System.out.println("Company Details:");
        System.out.println("===============");

        c.setID(4001);
        c.setEmpName("Jack");
        c.setEmpCompany("FestNest");
        System.out.println("Employee ID: " + c.getID());
        System.out.println("Employee Name: " + c.getEmpName());
        System.out.println("Employee Company: " + c.getEmpCompany());


        System.out.println("");
        System.out.println("Company Details:");
        System.out.println("===============");

        c.setID(4002);
        c.setEmpName("Alice");
        c.setEmpCompany("continental");
        System.out.println("Employee ID: " + c.getID());
        System.out.println("Employee Name: " + c.getEmpName());
        System.out.println("Employee Company: " + c.getEmpCompany());
    }
}