package person;

/**
 * Created by svetlana on 31.07.16
 */
public class Address {
    private String street;
    private String city;
    private int houseNumber;
    private String state;
    private int zipCode;

    public Address(String street, String city, int houseNumber, String state, int zipCode) {

        if(houseNumber < 0 ) {
            houseNumber = 0;
        }

        if(zipCode < 0 ) {
            zipCode = 0;
        }

        if(street.length() == 0) {
            street = "Unknown";
        }

        if(city.length() == 0) {
            city = "Unknown";
        }

        if(state.length() == 0) {
            state = "Unknown";
        }

        this.street = street;
        this.city = city;
        this.houseNumber = houseNumber;
        this.state = state;
        this.zipCode = zipCode;
    }

    public void setCity(String city) {

        if(city.length() == 0) {
            city = "Unknown";
        }
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setState(String state) {
        if(state.length() == 0) {
            state = "Unknown";
        }
        this.state = state;
    }

    public void setZipCode(int zipCode) {
        if(zipCode < 0 ) {
            zipCode = 0;
        }
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return houseNumber + street + "st. ," + city + ", " + state;
    }

    @Override
    public boolean equals(Object o) {

        if(this == o) {
            return true;
        }

        if(! (o instanceof Address)) {
            return false;
        }

        Address address = (Address) o;

        return street.equals(address.street) && city.equals(address.city) &&
                houseNumber == address.houseNumber && state == address.state &&
                zipCode == address.zipCode;
    }

    public Address duplicate() {

        Address address = new Address(street, city, houseNumber, state, zipCode);

        return address;
    }

   }
