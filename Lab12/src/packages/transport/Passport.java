package packages.transport;

public class Passport {
    private String ownerName;
    private String car;
    private String serialNumber;
    private String label;
    private String engineVolume;
    private String color;

    public Passport(String ownerName, String car, String serialNumber, String label, String engineVolume, String color) {
        this.ownerName = ownerName;
        this.car = car;
        this.serialNumber = serialNumber;
        this.label = label;
        this.engineVolume = engineVolume;
        this.color = color;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Passport changeOwner(String ownerName) {
        return PassportUtil.changeOwner(this, ownerName);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "ownerName='" + ownerName + '\'' +
                ", car='" + car + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", label='" + label + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}



