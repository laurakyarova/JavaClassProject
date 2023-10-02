package class13;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {

        SyntaxEmployee e1=new SyntaxEmployee();
        e1.empID=123345;
        e1.salary=120000;

        SyntaxEmployee e2=new SyntaxEmployee();
        e2.empID=24536;
        e2.salary=100000;

        System.out.println(e1.empID);
        System.out.println(e1.salary);
        System.out.println(SyntaxEmployee.CEO);


    }

}
