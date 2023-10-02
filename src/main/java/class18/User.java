package class18;

public class User {
    String name;
    String mNumber;

    public User(String name, String mNumber){
        this.name=name;
        this.mNumber=mNumber;
    }
}
class UserInfo extends User {
   String address;
    public UserInfo(String name,String mNumber,String address) {
        super(name, mNumber);
        this.address=address;
    }
    void userDetails(){
        System.out.println(name+" "+mNumber+" "+address);
    }

}
class UserTester{
    public static void main(String[] args) {
        UserInfo user=new UserInfo("Laura","565-625-4678","35 Main Street");
        user.userDetails();
    }

}
