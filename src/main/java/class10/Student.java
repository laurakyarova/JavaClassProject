package class10;

public class Student {
     //Properties/Attributes
    String name;
    int age;
    String id;

    //Methods/functions/Behaviours
    void study(){
        System.out.println("Studying 16 hours a day.......");

    }

    public static void main(String[] args) {

        //we are creating an actual student by using student class
        Student ehabObj=new Student();
        ehabObj.name="Ehab";
        ehabObj.age=23;
        ehabObj.id="abc123";
        ehabObj.study();

        Student habibObj=new Student();
        habibObj.name="Habib";
        habibObj.age=20;
        habibObj.id="abd123";
        habibObj.study();
    }


}
