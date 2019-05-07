public class Country {

    private String countryName;
    private String capitalCity;

    public Country(String countryName, String capitalCity) {
        this.countryName = countryName;
        this.capitalCity = capitalCity;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryInitial() {
        return countryName.substring(0,1);
    }

    public int getCountryNameLength() {
        return countryName.length();
    }
}
