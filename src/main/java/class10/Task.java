package class10;

public class Task {
    public static void main(String[] args) {

        String username="Laura";
        String password="1245$";
        String confPassw="1245$";
        if(username.isEmpty()||password.isEmpty()) {
            System.out.println("Username and Password cannot be empty");
        }
        else if(password.length()<8){
            System.out.println("Password is too short");
        }else if(password.contains(username)) {
            System.out.println("Password cannot contain username");
        }else if(!password.equals(confPassw)){
            System.out.println("Password do not match");
        }else{
            System.out.println("Your username and password has been created");
        }


    }
}
