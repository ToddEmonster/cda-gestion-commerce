import commerce.tp.Shop;

public class Main {
    public static void main(String[] args) {
        testShop();
    }

    private static void testShop() {
        Shop gameShop = new Shop();

        gameShop.addProduct("Mysterium", 5F, 10F);
        gameShop.addProduct("Bang!", 7F, 15F);
        gameShop.addProduct("Loups-garou de Thiercelieux", 6F, 12F);

        gameShop.buyProduct(0, 12);
        gameShop.buyProduct(1, 20);
        gameShop.buyProduct(2, 8);

        gameShop.displayStockProducts();
        gameShop.displayBalance();

        gameShop.sellProduct(0, 3);
        gameShop.sellProduct(1, 5);
        gameShop.sellProduct(2, 4);

        gameShop.displayStockProducts();
        gameShop.displayBalance();
    }


}
