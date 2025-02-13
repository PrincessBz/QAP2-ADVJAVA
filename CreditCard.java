public class CreditCard {
    private Money balance;
    @SuppressWarnings("FieldMayBeFinal")
    private Money creditLimit;
    @SuppressWarnings("FieldMayBeFinal")
    private Person owner;

    // constructors
    public CreditCard (Person newCardHolder, Money limit)
    {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0); 
    }

    // Getters method

    public Money getBalance ()
    {
        return new Money(balance);
    }

    public Money getCreditLimit()
    {
        return new Money(creditLimit);
    }

    public String getPersonals()
    {
        return owner.toString();
    }

    // charge payment method

    public void charge(Money amount)
    {
       Money newBalance = balance.add(amount);
        System.out.println("Attempt to charge: " + amount);
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
            System.out.println("Charge approved. New balance: " + balance);
        } else {
            System.out.println("Charge denied. Exceeds credit limit.");
        }
    }

     public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment made: " + amount + ". New balance: " + balance);
    }


}