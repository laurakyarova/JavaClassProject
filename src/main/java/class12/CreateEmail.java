package class12;

public class CreateEmail {

    String createEmail(String firstName,String lastName,String emailType){
        String result=firstName+lastName+"@"+emailType+".com";
        return result;
       // return firstName+lastName+"@"+emailType+".com";
    }


}
