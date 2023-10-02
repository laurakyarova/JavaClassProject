package class19;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard c=new CreditCard();
        c.calcInterest(3000);
        Visa v=new Visa();
        v.calcInterest(2000);
        AX ax=new AX();
        ax.calcInterest(4000);

    }
}
