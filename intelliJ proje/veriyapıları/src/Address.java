
/**
 *
 * @author Samet
 */
public class Address {

    /**
     * country for address
     */
    private String country;

    /**
     * city for address
     */
    private String city;

    /**
     * district for address
     */
    private String district;

    /**
     * street for address
     */
    private String street;

    /**
     * number for address
     */
    private int number;

    /**
     * no parameter constructor
     */
    public Address(){
        this.country = null;
        this.city = null;
        this.district = null;
        this.street = null;
        this.number = 0;
    }

    /**
     *
     * @param country country for address
     * @param city city for address
     * @param district district for address
     * @param street street for address
     * @param number number for address
     */
    public Address(String country, String city, String district, String street, int number){
        this.country = country;
        this.city = city;
        this.district = district;
        this.street = street;
        this.number = number;
    }

    /**
     *
     * @param country country for address
     */
    public void setCountry(String country){
        this.country = country;
    }

    /**
     *
     * @param city city for address
     */
    public void setCity(String city){
        this.city = city;
    }

    /**
     *
     * @param district district for address
     */
    public void setDistrict(String district){
        this.district = district;
    }

    /**
     *
     * @param street street for address
     */
    public void setStreet(String street){
        this.street = street;
    }

    /**
     *
     * @param number number for address
     */
    public void setNumber(int number){
        this.number = number;
    }

    /**
     *
     * @return country for address
     */
    public String getCountry(){
        return this.country;
    }

    /**
     *
     * @return city for address
     */
    public String getCity(){
        return this.city;
    }

    /**
     *
     * @return district for address
     */
    public String getDistrict(){
        return this.district;
    }

    /**
     *
     * @return street for address
     */
    public String getStreet(){
        return this.street;
    }

    /**
     *
     * @return number for address
     */
    public int getNumber(){
        return this.number;
    }
}
