package kg.megacom;

import java.util.Date;

public class Ipad {
    private String model;
    private Date arrivedDate;

    public Ipad(String model, Date arrivedDate) {
        this.model = model;
        this.arrivedDate = arrivedDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getArrivedDate() {
        return arrivedDate;
    }

    public void setArrivedDate(Date arrivedDate) {
        this.arrivedDate = arrivedDate;
    }

    @Override
    public String toString() {
        return "Ipad{" +
                "model='" + model + '\'' +
                ", arrivedDate=" + arrivedDate +
                '}';
    }
}
