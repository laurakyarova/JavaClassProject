package class17;

public class Teacher {
    String name;
    int age;
    String subject;

    void speaks(){
        System.out.println("classes are done");
    }
    void reads(){
        System.out.println("tasks are due tomorrow");
    }
    void eats(){
        System.out.println("It`s lunch time");
    }
}
class MathTeacher extends Teacher{
    int classHours=22;

    void printClassHours(){
        System.out.println(classHours);
    }

}
class ChemistryTeacher extends Teacher{
    String experiment="Lava";
    void printExperiment(){
        System.out.println(experiment);
    }

}
class PianoTeacher extends Teacher{
    String song="Christmas song";
    void printSong(){
        System.out.println(song);
    }

}