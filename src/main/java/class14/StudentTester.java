package class14;

import static class14.Students.NUMBER_OF_STUDENTS;

public class StudentTester {
    static int numberOfStudents;

    public static void main(String[] args) {

        Students st1=new Students();
        st1.name="Laura";
        st1.iD="1265LK";
        NUMBER_OF_STUDENTS++;

        Students st2=new Students();
        st2.name="Ellie";
        st2.iD="45846EM";
        NUMBER_OF_STUDENTS++;

        Students st3=new Students();
        st3.name="Andrek";
        st3.iD="485365AC";
        NUMBER_OF_STUDENTS++;

        System.out.println("total number of students is "+NUMBER_OF_STUDENTS);




    }
}
