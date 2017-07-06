package pe.edu.upc.payday.models;

/**
 * Created by Jorge GD on 18/05/2017.
 */

public class LenderType {
    private String description;

    public LenderType() {
    }

    public LenderType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
