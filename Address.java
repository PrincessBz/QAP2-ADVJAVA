public class Address{
    @SuppressWarnings("FieldMayBeFinal")
    private String street;
    @SuppressWarnings("FieldMayBeFinal")
    private String city;
    @SuppressWarnings("FieldMayBeFinal")
    private String state;
    @SuppressWarnings("FieldMayBeFinal")
    private String zip;

     
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    

    // toString method
    @Override
    public String toString()
    {
        return street + "," + city + "," + state + "," + zip ;
    } 

}