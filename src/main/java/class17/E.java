package class17;

public class E {
    static String name="Laura";
    static void printF(){
        System.out.println("F");
    }
}
class G extends E{
    public static void main(String[] args) {
        printF();
        System.out.println(name);
    }

}
