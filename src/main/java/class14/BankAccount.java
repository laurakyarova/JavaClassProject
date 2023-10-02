package class14;

public class BankAccount {
    String name="Laura";
   private String userName="Laura123";
   private String password="pass123";
    private double accountBalance=284;
    private  String accountNumber="2843463";

   private void printInfo(){
        System.out.println("I am Laura from batch 17");
    }

    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        System.out.println(bankAccount.name);
   }
}
