package packages.technics;

import java.util.Date;

public class Passport {
    private String name;
    private String model;
    private int waranty;
    private String label;
    private String color;
    private String type;
    Date warrantyStartDate;


    public Passport(String name, String model, String label, String color, String type, int waranty, Date warrantyStartDate) {
        this.name = name;
        this.model = model;
        this.label = label;
        this.color = color;
        this.type = type;
        this.waranty = waranty;
        this.warrantyStartDate = warrantyStartDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWaranty() {
        return waranty;
    }

    public void setWaranty(int waranty) {
        this.waranty = waranty;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getWarrantyStartDate() {
        return warrantyStartDate;
    }

    public void setWarrantyStartDate(Date warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", waranty=" + waranty +
                ", label='" + label + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", warrantyStartDate=" + warrantyStartDate +
                '}';
    }
}
