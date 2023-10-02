package class15;

public class Student {

    private String name;
    private double subj1;
    private double subj2;
    private double subj3;

    public Student(String sName,double sSubj1, double sSubj2,double sSubj3){
        name=sName;
        subj1=sSubj1;
        subj2=sSubj2;
        subj3=sSubj3;

    }
    public void averGrade(){
        double result=(subj1+subj2+subj3)/3;
        System.out.println(name+" got "+result);
    }

    public static void main(String[] args) {
        new Student("Laura",90.3,98.5,97).averGrade();

        new Student("Ellie",98,96.9,92).averGrade();

    }
}
