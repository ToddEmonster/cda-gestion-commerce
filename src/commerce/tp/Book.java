package commerce.tp;

public class Book extends Product {
    private String author;
    private String editor;

    public Book(String label, float buyingPrice, float sellingPrice, String author, String editor) {
        super(label, buyingPrice, sellingPrice);
        this.author = author;
        this.editor = editor;
    }

    public String getAuthor() {
        return author;
    }

    public String getEditor() {
        return editor;
    }
}
