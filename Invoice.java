package week04.invoice;

public class Invoice {

    private String partNum;
    private String Description;
    private int quantity;
    private double price;

    
    public Invoice(String partNum, String Description, int quantity, double price) {
        this.partNum = partNum;
        this.Description = Description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getPartNum() {
        return this.partNum;
    }

    public String getDescription() {
        return this.Description;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    
    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

