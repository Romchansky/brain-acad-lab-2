package packages.citizen;

public class Passport {
    private String name;
    private String passportSeries;
    private String number;
    private String spouseId;

    public Passport(String name, String passportSeries, String number) {
        this.name = name;
        this.passportSeries = passportSeries;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSpouseId() {
        return spouseId;
    }

    public void setSpouseId(String spouseId) {
        this.spouseId = spouseId;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", passportSeries='" + passportSeries + '\'' +
                ", number='" + number + '\'' +
                ", spouseId='" + spouseId + '\'' +
                '}';
    }
}
