public class Money {
    // attributes
    private long dollars;
    private long cents;

    // constructors 
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - dollars) * 100);
    }
    
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }
    
    public Money add(Money other) {
        double total = this.toDouble() + other.toDouble();
        return new Money(total);
    }
    
    public Money subtract(Money other) {
        double total = this.toDouble() - other.toDouble();
        return new Money(total);
    }
    
    public int compareTo(Money other) {
        return Double.compare(this.toDouble(), other.toDouble());
    }
    
    public boolean equals(Money other) {
        return this.dollars == other.dollars && this.cents == other.cents;
    }
    
    public double toDouble() {
        return dollars + cents / 100.0;
    }
    
    @Override
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }

    
    


}