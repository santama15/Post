public class Address {

    private String street;
    private int houseNr;
    private String postCode;

    public Address(String street, int houseNr, String postCode) {
        this.street = street;
        this.houseNr = houseNr;
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNr() {
        return houseNr;
    }

    public String getPostCode() {
        return postCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNr=" + houseNr +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
