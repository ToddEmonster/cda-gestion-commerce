package commerce.tp;

public class Shop {
    private String label;
    private float buyingPrice;
    private float sellingPrice;
    private int stock;
    private String description;

    public Shop(String label, float buyingPrice, float sellingPrice) {
        this.label = label;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.stock = 0;
        this.description = "Pas de description";
    }

    public String getLabel() {
        return label;
    }

    public float getBuyingPrice() {
        return buyingPrice;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
