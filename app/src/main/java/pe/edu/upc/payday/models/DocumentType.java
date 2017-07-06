package pe.edu.upc.payday.models;

/**
 * Created by Jorge GD on 18/05/2017.
 */

public class DocumentType {
    private String description;

    public DocumentType() {
    }

    public DocumentType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
