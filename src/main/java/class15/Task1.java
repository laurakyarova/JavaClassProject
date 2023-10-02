package class15;

public class Task1 {

    private String name;

    public Task1(String tName){
        name=tName;
        System.out.println("Constructor with one parameter "+tName);

    }
    public Task1(){
        System.out.println("Constructor with no parameters");
    }
}
