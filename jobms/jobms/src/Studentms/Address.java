package Studentms;

public class Address {
    private String city;
    private String pinCode;
    private String state;
    private String Country;

    public Address() {
    }

    public Address(String city, String pinCode, String state, String country) {
        this.city = city;
        this.pinCode = pinCode;
        this.state = state;
        Country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", state='" + state + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
