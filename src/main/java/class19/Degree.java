package class19;

public class Degree {
    public void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }  }
    class Bachelors extends Degree{

    }
    class Masters extends Degree{

        @Override
        public void getPrerequisite() {
            System.out.println("To get masters degree you need bachelors first");
        }


    public static void main(String[] args) {
        Masters m=new Masters();
        m.getPrerequisite();
        Bachelors b=new Bachelors();
        b.getPrerequisite();
        Degree d=new Degree();
        d.getPrerequisite();

    }


}
