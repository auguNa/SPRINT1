package S1_01.N3Ejercicio1;

public abstract class News {
    protected String owner;
    protected String text;
    protected int punctuation;
    protected double price;

    public News(String owner) {
        this.owner = owner;
        this.text = " ";
    }

    public abstract void calculatePriceNews();

    public abstract void calculatePunctuation();

    public abstract int getId();

    public String getOwner() {
        return owner;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPunctuation() {
        return punctuation;
    }

    public void setPunctuation(int punctuation) {
        this.punctuation = punctuation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
