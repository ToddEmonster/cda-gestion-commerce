package commerce.tp;

import java.util.ArrayList;

public class Cd extends Product {
    private String author;
    private String interpreter;
    private ArrayList<String> tracks;

    public Cd(String label, float buyingPrice, float sellingPrice, String author, String interpreter,
            ArrayList<String> tracks) {
        super(label, buyingPrice, sellingPrice);
        this.author = author;
        this.interpreter = interpreter;
        this.tracks = tracks;
    }

    public String getAuthor() {
        return author;
    }

    public String getInterpreter() {
        return interpreter;
    }

    public ArrayList<String> getTracks() {
        return tracks;
    }
}
