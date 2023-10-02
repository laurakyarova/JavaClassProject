package class16;

public class Student {
    private String name;
    private String address;

    public Student(String name,String address){
        this.name=name;
        this.address=address;

    }
    public void printInfo(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        new Student("Laura","123 Street, Florida").printInfo();
    }
}
