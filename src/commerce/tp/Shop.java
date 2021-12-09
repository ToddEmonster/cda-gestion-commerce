package commerce.tp;

import java.util.ArrayList;

public class Shop {
    private float balance;
    private ArrayList<Product> products;

    public Shop() {
        this(0,  new ArrayList<Product>());
    }

    public Shop(float balance) {
        this(balance,  new ArrayList<Product>());
    }

    public Shop(float balance, ArrayList<Product> products) {
        this.balance = balance;
        this.products = products;
    }

    public float getBalance() {
        return balance;
    }

    public void displayBalance() {
        System.out.println("\n[ Balance actuelle du magasin : " + this.balance + " € ]\n");
    }

    public void addProduct(String label, float buyingPrice, float sellingPrice) {
        this.products.add(new Product(label, buyingPrice, sellingPrice));
    }

    public void buyProduct(int refProduct, int nbCopies) {
        Product product = this.products.get(refProduct);
        product.addToStock(nbCopies);
        this.balance -= nbCopies * product.getBuyingPrice();
        System.out.println("[ "
                + nbCopies + " exemplaire(s) de "
                + product.getLabel()
                + " acheté(s) ]");
    }

    public void sellProduct(int refProduct, int nbCopies) {
        Product product = this.products.get(refProduct);
        product.removeFromStock(nbCopies);
        this.balance += nbCopies * product.getSellingPrice();
        System.out.println("[ "
                + nbCopies + " exemplaire(s) de "
                + product.getLabel()
                + " vendu(s) ]");
    }

    public void displayStockProducts() {
        System.out.println("\n[ Stock du magasin : ]");
        this.products.forEach(product -> System.out.println(
                product.getLabel()
                        + " (" + product.getSellingPrice() + " €) : "
                        + product.getStock() + " exemplaires"));
    }
}
