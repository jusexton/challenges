package helpers;

public class Book {
    private final String category;
    private final String code;
    private final int quantity;

    public Book(final String label) {
        String[] codeAndQuantity = label.split(" ");

        this.category = codeAndQuantity[0].substring(0, 1);
        this.code = codeAndQuantity[0].substring(1);
        this.quantity = Integer.parseInt(codeAndQuantity[1]);
    }

    public String getCategory() {
        return this.category;
    }

    public String getCode() {
        return this.code;
    }

    public int getQuantity() {
        return this.quantity;
    }
}
